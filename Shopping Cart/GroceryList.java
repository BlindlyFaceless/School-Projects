import java.util.*;

public class GroceryList 
{
    public List<GroceryItem> list;

    GroceryList()
    {
        list = new ArrayList<GroceryItem>();
    }

    public void addItem(GroceryItem itemToAdd)
    {
        list.add(itemToAdd);
    }

    public void removeItem(String itemName)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName() == itemName)
            {
                list.remove(i);
            }
        }
    }

    public String printList()
    {
        String outString = "";
        for(int i = 0; i < list.size(); i++)
        {
            outString += list.get(i).toString() + System.lineSeparator();
        }
        return outString;
    }

    public double subtotal()
    {
        double out = 0.0;
        for(int i = 0; i < list.size(); i++)
        {
            out += list.get(i).getCost();
        } 
        return out;
    }

    public double taxPayable()
    {
        double out = 0.0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getTaxable())
            {
                out += (list.get(i).getCost() * 15.0) / 100;
            }
        }
        return out;
    }

    public double finalTotal()
    {
        return subtotal() + taxPayable();
    }

    public String printReceipt()
    {
        String out = "";
        for(int i = 0; i < list.size(); i++)
        {
            out += list.get(i).toString() + System.lineSeparator();
        }
        out += "Subtotal = " + subtotal() + System.lineSeparator() + "Tax Payable = " + taxPayable() + System.lineSeparator() + "Final Total = " + finalTotal();
        return out;
    }
}
