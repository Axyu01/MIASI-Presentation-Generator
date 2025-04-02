import javax.swing.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.awt.*;
import java.util.ArrayList;

public class ParserTestsMain {
    public static void main(String[] args) throws Exception {

        //Parser kod
        //Iteracja po slajdach z zapisaniem
        ArrayList<Object> parameters = new ArrayList<Object>();
        TextParameters tP = new TextParameters();
        tP.position = new Vector2(30,30);
        tP.font_color = Color.MAGENTA;
        parameters.add(new ImageParameters());
        parameters.add(tP);
        SlidePanel panel = new SlidePanel(parameters);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 720);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        PresentationLexer lexer = new PresentationLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        PresentationParser parser = new PresentationParser(tokens);

        // start parsing at the program rule
        ParseTree tree = parser.program();
        // System.out.println(tree.toStringTree(parser));

        // create a visitor to traverse the parse tree
        PresentationVisitor visitor = new PresentationVisitor();
        System.out.println(visitor.visit(tree));
    }
}

