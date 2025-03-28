import javax.swing.*;

public class ParserTestsMain {
    public static void main(String[] args) {

        //Parser kod
        //Iteracja po slajdach z zapisaniem
        SlidePanel panel = new SlidePanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 720);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
