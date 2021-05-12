
public class GroceryItem 
{
    private String name;
    private double cost;
    private boolean taxable = false;

    GroceryItem(String n, double c, boolean t)
    {
        name = n;
        cost = c;
        taxable = t;
    }

    GroceryItem(String n, double c)
    {
        name = n;
        cost = c;
    }

    public String getName()
    {
        return name;
    }

    public double getCost() 
    {
        return cost;
    }

    public boolean getTaxable()
    {
        return taxable;
    }

    @Override
    public String toString()
    {
        String out;
        if(taxable)
            out = name + " ... " + cost + " ... Tax";
        else
            out = name + " ... " + cost + " ... No Tax";
        return out;
    }
}
