public class MyPoint 
{
    private int x = 0;
    private int y = 0;

    MyPoint()
    {
        x = 0;
        y = 0;
    }

    MyPoint(int xPoint, int yPoint)
    {
        x = xPoint;
        y = yPoint;
    }

    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    void setX(int xPoint)
    {
        x = xPoint;
    }
    void setY(int yPoint)
    {
        y = yPoint;
    }

    void setXY(int xPoint, int yPoint)
    {
        x = xPoint;
        y = yPoint;
    }

    String distance(int x, int y)
    {
        return "( " + Math.abs(this.x - x) + " , " + Math.abs(this.y - y) + " )";
    }

    String distance(MyPoint other)
    {
        return "( " + Math.abs(this.x - other.x) + " , " + Math.abs(this.y - other.y) + " )";
    }

    String distance()
    {
        return "( " + Math.abs(this.x - 0) + " , " + Math.abs(this.y - 0) + " )";
    }

    @Override
    public String toString()
    {
        return "( " + x + " , " + y + " )";
    }
}
