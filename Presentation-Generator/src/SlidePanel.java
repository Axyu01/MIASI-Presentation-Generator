import javax.swing.*;
import java.awt.*;

public class SlidePanel extends JPanel {
    SlidePanel() {
        this.setPreferredSize(new Dimension(720, 720));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        draw_text(g2d, "Courier", Color.BLACK, Font.BOLD, 32, 16, 32, "Text First");
        draw_text(g2d, "Courier", Color.GRAY, Font.ITALIC, 32, 16, 64, "Text Second");
        draw_text(g2d, "Courier", Color.RED, Font.PLAIN, 32, 16, 96, "3rd text");

        draw_image(g2d, "res/meme.jpg", 200, 200, 0.2);
    }

    public void draw_text(
            Graphics2D g2d,
            String font_name,
            Paint font_color,
            int font_style,
            int font_size,
            int pos_x,
            int pos_y,
            String text
    ) {
        g2d.setPaint(font_color);
        g2d.setFont(new Font(font_name, font_style, font_size));
        g2d.drawString(text, pos_x, pos_y);
    }

    public void draw_image(
            Graphics2D g2d,
            String path_to_image,
            int pos_x,
            int pos_y,
            double size
    ) {
        Image image = new ImageIcon(path_to_image).getImage();
        g2d.drawImage(
                image,
                pos_x,
                pos_y,
                pos_x + (int)(image.getHeight(null) * size),
                pos_y + (int)(image.getWidth(null) * size),
                null
        );
    }
}
