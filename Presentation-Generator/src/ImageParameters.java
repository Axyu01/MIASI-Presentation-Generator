import java.awt.*;

public class ImageParameters extends Parameters {

    public String path;
    public Vector2 position;
    public Double size;

    public ImageParameters() {
        dataType = DataType.IMAGE;

        path = "res/meme.jpg";
        position = new Vector2();
        size = 1d;
    }

    @Override
    public boolean SetParameter(String paramName, Object paramValue) {
        if(paramName.equals("path") && paramValue instanceof String) {
            path = (String)paramValue;
            return true;
        }
        else if(paramName.equals("position") && paramValue instanceof Vector2) {
            position = (Vector2)paramValue;
            return true;
        }
        else if(paramName.equals("size") && paramValue instanceof Double) {
            size = (Double)paramValue;
            return true;
        }
        return false;
    }
}
