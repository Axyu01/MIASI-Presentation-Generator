import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class Parameters {
    protected DataType dataType = null;
    public ArrayList<Pair<String, java.lang.Object>> params = new ArrayList<>();
    public java.lang.Object storedTempValue = null;
    public void SetParameter(String paramName, java.lang.Object paramValue) {
        params.add(new Pair<>(paramName, paramValue));
    }
    public DataType getType()
    {
        return dataType;
    }
}
