import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SlidePanel extends JPanel {
    Graphics2D g2d = null;
    ArrayList<Object> parameters;
    SlidePanel() {
        this.setPreferredSize(new Dimension(720, 720));
    }
    SlidePanel(ArrayList<Object> parameters) {
        this.setPreferredSize(new Dimension(720, 720));
        this.parameters = parameters;
    }

    public void paint(Graphics g) {
        g2d = (Graphics2D) g;

        //draw_text(g2d, "Courier", Color.BLACK, Font.BOLD, 32, new Vector2(16, 32), "Text First");
        //draw_text(g2d, "Courier", Color.GRAY, Font.ITALIC, 32, new Vector2(16, 64), "Text Second");
        //draw_text(g2d, "Courier", Color.RED, Font.PLAIN, 32, new Vector2(16, 96), "3rd text");

        //draw_image(g2d, "res/meme.jpg", new Vector2(200, 200), 0.2);
        //draw_image(new ImageParameters());
        for(Object parameter : parameters){
            if (parameter instanceof TextParameters)
            {
                draw_text((TextParameters) parameter);
            }
            else if (parameter instanceof ImageParameters)
            {
                draw_image((ImageParameters) parameter);
            }
        }

    }

    void draw_text(TextParameters params) {
        g2d.setPaint(params.font_color);
        g2d.setFont(new Font(params.font_name, params.font_style, params.font_size));
        g2d.drawString(params.text, params.position.x, params.position.y);
    }

    void draw_image(ImageParameters params) {
        Image image = new ImageIcon(params.path).getImage();
        g2d.drawImage(
                image,
                params.position.x,
                params.position.y,
                params.position.x + (int)(image.getHeight(null) * params.size),
                params.position.y + (int)(image.getWidth(null) * params.size),
                null
        );
    }
}
