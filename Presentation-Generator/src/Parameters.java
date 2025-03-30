public abstract class Parameters {
    protected DataType dataType = null;
    public boolean SetParameter(String paramName, Object paramValue) {
        return false;
    }
    public DataType getType()
    {
        return dataType;
    }
}
