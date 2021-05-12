import java.util.Random;

public class PointTest 
{
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint(new Random().nextInt(101), new Random().nextInt(101));
        MyPoint p2 = new MyPoint(new Random().nextInt(101), new Random().nextInt(101));
        System.out.println(p1.toString() + "," + p2.toString());
        System.out.println(p1.distance(new Random().nextInt(101), new Random().nextInt(101)));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());
    }
}
