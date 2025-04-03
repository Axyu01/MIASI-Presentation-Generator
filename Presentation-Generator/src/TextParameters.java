import org.antlr.v4.runtime.misc.Pair;

import java.awt.*;

public class TextParameters {
    public String font_name;
    public Paint font_color;
    public Integer font_style;
    public Integer font_size;
    public Vector2 position;
    public String text;

    public TextParameters()
    {
        font_name = "Courier";
        font_color = Color.BLACK;
        font_style = Font.PLAIN;
        font_size = 12;
        position = new Vector2();
        text = "example text";
    }
    public void SetParameters(Parameters p) {
        for(Pair<String, Object> pair : p.params) {
            String paramName = pair.a;
            Object paramValue = pair.b;
            if (paramName.equals("font_name") && paramValue instanceof String) {
                font_name = (String) paramValue;
            } else if (paramName.equals("font_color") && paramValue instanceof String) {
                font_color = Color.getColor((String) paramValue);
            } else if (paramName.equals("font_style") && paramValue instanceof Integer) {
                font_style = (Integer) paramValue;
            } else if (paramName.equals("font_size") && paramValue instanceof Integer) {
                font_size = (Integer) paramValue;
            } else if (paramName.equals("position") && paramValue instanceof Vector2) {
                position = (Vector2) paramValue;
            } else if (paramName.equals("text") && paramValue instanceof String) {
                text = (String) paramValue;
            }
        }
    }
}
