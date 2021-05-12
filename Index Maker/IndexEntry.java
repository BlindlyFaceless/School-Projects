import java.util.ArrayList;

public class IndexEntry {
    private String word;
    private ArrayList<Integer> numsList;

    IndexEntry(String a)
    {
        word = a.toUpperCase();
        numsList = new ArrayList<Integer>();   
    }

    public void add(int num)
    {
        if(numsList.indexOf(num) == -1)
        {
            numsList.add(num);
            //System.out.println(word + " " +numsList);
        }
    }

    public String getWord()
    {
        return word;
    }

    public String toString()
    {
        String out = word;
        for(int i = 0; i < numsList.size(); i++)
        {
            out += " " + numsList.get(i);
            if(i < numsList.size()-1)
            {
                out+=",";
            }
        }
        return out;
    }
}
