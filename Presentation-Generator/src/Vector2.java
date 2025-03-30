public class Vector2 {
    public int x,y;
    public Vector2()
    {
        x = y = 0;
    }
    public Vector2(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void Add(Vector2 v)
    {
        x += v.x;
        y += v.y;
    }
}
