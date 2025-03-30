import java.awt.*;

public class TextParameters extends Parameters {
    public String font_name;
    public Paint font_color;
    public Integer font_style;
    public Integer font_size;
    public Vector2 position;
    public String text;

    public TextParameters()
    {
        dataType = DataType.TEXT;

        font_name = "Courier";
        font_color = Color.BLACK;
        font_style = Font.PLAIN;
        font_size = 12;
        position = new Vector2();
        text = "example text";
    }

    @Override
    public boolean SetParameter(String paramName, Object paramValue) {
        if(paramName.equals("font_name") && paramValue instanceof String) {
            font_name = (String)paramValue;
            return true;
        }
        else if(paramName.equals("font_color") && paramValue instanceof String) {
            paramName = (String)paramValue;
            return true;
        }
        else if(paramName.equals("font_style") && paramValue instanceof Integer) {
            font_style = (Integer)paramValue;
            return true;
        }
        else if(paramName.equals("font_size") && paramValue instanceof Integer) {
            font_size = (Integer)paramValue;
            return true;
        }
        else if(paramName.equals("position") && paramValue instanceof Vector2) {
            position = (Vector2)paramValue;
            return true;
        }
        else if(paramName.equals("text") && paramValue instanceof String) {
            paramName = (String)paramValue;
            return true;
        }
        return false;
    }
}
