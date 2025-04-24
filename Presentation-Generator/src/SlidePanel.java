import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SlidePanel extends JPanel {
    Graphics2D g2d = null;
    ArrayList<Object> parameters;
    private static int frameIndex = 0;
    SlidePanel() {
        this.setPreferredSize(new Dimension(720, 720));
    }
    SlidePanel(ArrayList<Object> parameters) {
        this.setPreferredSize(new Dimension(720, 720));
        this.parameters = parameters;
    }

    private boolean slideSaved = false;

    // FIXME: If not working, make sure paths are correct. It seams on unix based machines paths are relative to project's root [ miasi/ ] in our case, but on windows it is relative to [ Presentation-Generator/ ]

    @Override
    public void paint(Graphics g) { // FIXME: Probably, we should make own function to not display any windows, since paint() is JComponent's class
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        renderSlide(g2d);

        if (!slideSaved) {
            BufferedImage image = new BufferedImage(720, 720, BufferedImage.TYPE_INT_ARGB);
            Graphics2D imageG2D = image.createGraphics();
            renderSlide(imageG2D);
            imageG2D.dispose();

            File outputDir = new File("./output");
            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }

            try {
                File outputFile = new File(String.format("./output/slide_%d.png", frameIndex++));
                ImageIO.write(image, "png", outputFile);
                System.out.println("Saved slide to " + outputFile.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }

            slideSaved = true;
        }
    }


    private void renderSlide(Graphics2D g2d) {

        g2d.setPaint(Color.WHITE);
        g2d.fillRect(0, 0, 720, 720);

        if (parameters != null) {
            for (Object parameter : parameters) {
                if (parameter instanceof TextParameters) {
                    draw_text(g2d, (TextParameters) parameter);
                } else if (parameter instanceof ImageParameters) {
                    draw_image(g2d, (ImageParameters) parameter);
                }
            }
        }
    }

    void draw_text(Graphics2D g2d, TextParameters params) {
        g2d.setPaint(params.font_color);
        g2d.setFont(new Font(params.font_name, params.font_style, params.font_size));
        g2d.drawString(params.text, params.position.x, params.position.y);
    }

    void draw_image(Graphics2D g2d, ImageParameters params) {
        Image image = new ImageIcon(params.path).getImage();
        int imgWidth = image.getWidth(null);
        int imgHeight = image.getHeight(null);

        g2d.drawImage(
                image,
                params.position.x,
                params.position.y,
                params.position.x + (int)(imgWidth * params.size),
                params.position.y + (int)(imgHeight * params.size),
                0, 0, imgWidth, imgHeight,
                null
        );
    }
}
