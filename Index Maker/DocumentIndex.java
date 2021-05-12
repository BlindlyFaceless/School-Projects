import java.util.ArrayList;

public class DocumentIndex extends ArrayList <IndexEntry>
{
    private ArrayList<IndexEntry> entryList = new ArrayList<IndexEntry>();
    
    DocumentIndex()
    {
        super();
    }

    public DocumentIndex(int initialCapacity)
    {
      super(initialCapacity);
    }

    public void addWord(String word, int num)
    { 
        IndexEntry entry = entryList.get(foundOrInserted(word));
        entry.add(num);
    }

    public void addAllWords(String str, int num)
    {
        if(str.compareTo("") != 0)
        {
            String[] arrOfStr = str.split("\\W+");
            for(String a : arrOfStr)
            {
                addWord(a, num);
            }
        }
    }

    private int foundOrInserted(String word)
    {
        int i;
        for(i = 0; i < entryList.size(); i++)
        {
            int comp = word.compareToIgnoreCase(entryList.get(i).getWord());
            if(comp == 0)
            {
                return i;
            }
            if(comp<i)
            {
                break;
            }
        }
        entryList.add(i, new IndexEntry(word));
        return i;
    }

    public void printAll()
    {
        for(IndexEntry entry : entryList)
        {
            System.out.println(entry.toString() + System.lineSeparator() );
        }
    }
}
