import java.util.ArrayList;
import java.util.List;

public class WordBuckets 
{
    public static List<String> list = new ArrayList<String>()
    {{
        add("talk");
        add("migration");
        add("rehearsal");
        add("slice");
        add("earthwax");
        add("abnormal");
        add("white");
        add("welcome");
        add("arrangement");
        add("reliance");
        add("cheese");
        add("penalty");
        add("right");
        add("fly");
        add("reporter");
        add("design");
        add("passive");
        add("tip");
        add("plastic");
        add("asylum");
        add("few");
        add("conscious");
        add("heavy");
        add("apparatus");
        add("execution");
        add("symptom");
    }};

    public static List<List<String>> Buckets = new ArrayList<List<String>>();

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) 
    {
        for(int i = 0; i < alphabet.length(); i++)
        {
            List<String> temp = new ArrayList<String>();
            temp.add(alphabet.charAt(i) + " bucket");
            Buckets.add(temp);
        }
        for(int i = 0; i < Buckets.size(); i++)
        {
            Buckets.get(alphabet.indexOf(list.get(i).charAt(0))).add(list.get(i));
        }
        for(int i = 0; i < Buckets.size(); i++)
        {
            printBucket(Buckets.get(i));
        }
    }

    public static void printBucket(List<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("");
    }

    
}
