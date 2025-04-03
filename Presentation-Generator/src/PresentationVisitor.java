import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.ArrayList;

public class PresentationVisitor extends PresentationParserBaseVisitor<Object>{
    ArrayList<SlidePanel> slidePanels = new ArrayList<SlidePanel>();
    @Override
    public Object visitProgram(PresentationParser.ProgramContext ctx) {
        for(ParseTree child : ctx.slides)
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
        ArrayList<Object> slideParams = new ArrayList<>();
        for(ParseTree child : ctx.functions)
        {
            Parameters parameters = (Parameters) visit(child);
            if(parameters == null)
                continue;
            if(parameters.dataType == DataType.TEXT)
            {
                TextParameters tP = new TextParameters();
                tP.SetParameters(parameters);
                slideParams.add(tP);
            }
            else if(parameters.dataType == DataType.IMAGE)
            {
                ImageParameters iP = new ImageParameters();
                iP.SetParameters(parameters);
                slideParams.add(iP);
            }
        }
        return new SlidePanel(slideParams);
    }
    @Override
    public Object visitLastSlide(PresentationParser.LastSlideContext ctx)
    {
        SlidePanel slidePanel = new SlidePanel();
        return slidePanel;
    }
    @Override
    public Object visitImageFunction(PresentationParser.ImageFunctionContext ctx) {
        Parameters parameters = new Parameters();
        parameters.dataType = DataType.IMAGE;
        for(ParseTree child : ctx.params)
        {
            Pair<String,Object> pair = (Pair<String,Object>) visit(child);
            if(pair == null)
                continue;
            parameters.SetParameter(pair.a, pair.b);
        }
        return parameters;
    }
    @Override
    public Object visitTextFunction(PresentationParser.TextFunctionContext ctx) {
        Parameters parameters = new Parameters();
        parameters.dataType = DataType.TEXT;
        for(ParseTree child : ctx.params)
        {
            Pair<String,Object> pair = (Pair<String,Object>) visit(child);
            if(pair == null)
                continue;
            parameters.SetParameter(pair.a, pair.b);
        }
        return parameters;
    }
    @Override
    public Object visitLastFunction(PresentationParser.LastFunctionContext ctx) {
        return null;
    }
    @Override
    public Object visitSomeParameter(PresentationParser.SomeParameterContext ctx) {
        Pair<String,Object> pair = new Pair<String,Object>(ctx.ID().getText(),visit(ctx.expr()));
        return pair;
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
        else if(ctx.DOUBLE() != null)
        {
            return (Double) Double.parseDouble(ctx.DOUBLE().getText());
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
            String str = ctx.PATH().getText();
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