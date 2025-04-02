import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.ArrayList;

public class PresentationVisitor extends PresentationParserBaseVisitor<Object>{
    ArrayList<SlidePanel> slidePanels = new ArrayList<SlidePanel>();
    @Override
    public Object visitProgram(PresentationParser.ProgramContext ctx) {
        for(ParseTree child : ctx.children)
        {
            slidePanels.add((SlidePanel) visit(child));
        }
        for(SlidePanel panel : slidePanels)
        {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(720, 720);
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }


        return null;
    }
    @Override
    public Object visitSomeSlide(PresentationParser.SomeSlideContext ctx) {
        SlidePanel slidePanel = new SlidePanel();
        for(ParseTree child : ctx.children)
        {
            Parameters parameters = (Parameters) visit(child);
            if(parameters.dataType == DataType.TEXT)
            {
                TextParameters tP = new TextParameters();
                tP.SetParameters(parameters);
                slidePanel.draw_text(tP);
            }
            else if(parameters.dataType == DataType.IMAGE)
            {
                ImageParameters iP = new ImageParameters();
                iP.SetParameters(parameters);
                slidePanel.draw_image(iP);
            }
        }
        return slidePanel;
    }
    @Override
    public Object visitLastSlide(PresentationParser.LastSlideContext ctx)
    {
        SlidePanel slidePanel = new SlidePanel();
        for(ParseTree child : ctx.children)
        {
            Parameters parameters = (Parameters) visit(child);
            if(parameters.dataType == DataType.TEXT)
            {
                TextParameters tP = new TextParameters();
                tP.SetParameters(parameters);
                slidePanel.draw_text(tP);
            }
            else if(parameters.dataType == DataType.IMAGE)
            {
                ImageParameters iP = new ImageParameters();
                iP.SetParameters(parameters);
                slidePanel.draw_image(iP);
            }
        }
        return slidePanel;
    }
    @Override
    public Object visitImageFunction(PresentationParser.ImageFunctionContext ctx) {
        Parameters parameters = new Parameters();
        parameters.dataType = DataType.IMAGE;
        for(ParseTree child : ctx.children)
        {
            Pair<String,Object> pair = (Pair<String,Object>) visit(child);
            parameters.SetParameter(pair.a, pair.b);
        }
        return parameters;
    }
    @Override
    public Object visitTextFunction(PresentationParser.TextFunctionContext ctx) {
        Parameters parameters = new Parameters();
        parameters.dataType = DataType.TEXT;
        for(ParseTree child : ctx.children)
        {
            Pair<String,Object> pair = (Pair<String,Object>) visit(child);
            parameters.SetParameter(pair.a, pair.b);
        }
        return parameters;
    }
    @Override
    public Object visitLastFunction(PresentationParser.LastFunctionContext ctx) {
        Parameters parameters = new Parameters();
        if(ctx.TEXT() != null)
            parameters.dataType = DataType.TEXT;
        else if(ctx.IMAGE() != null)
            parameters.dataType = DataType.IMAGE;
        for(ParseTree child : ctx.children)
        {
            Pair<String,Object> pair = (Pair<String,Object>) visit(child);
            parameters.SetParameter(pair.a, pair.b);
        }
        return parameters;
    }
    @Override
    public Object visitSomeParameter(PresentationParser.SomeParameterContext ctx) {
        return new Pair<String,Object>(ctx.ID().getText(),visit(ctx.expr()));
    }
    @Override
    public Object visitLastParameter(PresentationParser.LastParameterContext ctx) {
        return new Pair<String,Object>(ctx.ID().getText(),visit(ctx.expr()));
    }
    @Override
    public Object visitExpr(PresentationParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            return (Integer) Integer.parseInt(ctx.INT().getText()); // Explicit conversion to Integer
        }
        else if(ctx.vector2() != null)
        {
            return visit(ctx.vector2());
        }
        else if(ctx.TEXT_BLOCK() != null)
        {
            String str = ctx.TEXT_BLOCK().getText();
            str = str.substring(2,str.length()-1);
            return str;
        }
        else if(ctx.PATH() != null)
        {
            String str = ctx.TEXT_BLOCK().getText();
            str = str.substring(1,str.length()-1);
            return str;
        }
        return null;
    }
    @Override
    public Object visitVector2(PresentationParser.Vector2Context ctx) {
        return new Vector2(Integer.parseInt(ctx.x.getText()),Integer.parseInt(ctx.y.getText()));
    }
}