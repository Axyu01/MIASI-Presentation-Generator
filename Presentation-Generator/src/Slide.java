import javax.swing.*;
import java.awt.*;

public class Slide extends JFrame {

    SlidePanel panel;

    Slide(){
        panel = new SlidePanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 720);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
