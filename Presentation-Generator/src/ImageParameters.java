import org.antlr.v4.runtime.misc.Pair;

public class ImageParameters {

    public String path;
    public Vector2 position;
    public Double size;

    public ImageParameters() {
        path = "res/meme.jpg";
        position = new Vector2();
        size = 1d;
    }

    public void SetParameters(Parameters p) {
        for(Pair<String, Object> pair : p.params) {
            String paramName = pair.a;
            Object paramValue = pair.b;
            if (paramName.equals("path") && paramValue instanceof String) {
                path = (String) paramValue;
            } else if (paramName.equals("position") && paramValue instanceof Vector2) {
                position = (Vector2) paramValue;
            } else if (paramName.equals("size") && paramValue instanceof Double) {
                size = (Double) paramValue;
            }
        }
    }
}
