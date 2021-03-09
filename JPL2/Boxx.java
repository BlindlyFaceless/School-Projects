public class Boxx {
    
    int length = 0;
    int width = 0;
    int height = 0;
    String newLine = System.getProperty("line.separator");
    String output = "";
    
    Boxx()
    {
        length = 0;
        width = 0;
        height = 0;
    }
    
    Boxx(int l)
    {
        //draws line to console
        for(int i = 0; i < l; i++)
        {
            output += "-";
        }
    }
    
    Boxx(int l, int w)
    {
        //draws box to console
        output += " ";
        for(int i = 0; i < l; i++)
        {
            output += "__";
        }
        output += newLine;
        
        for(int i = 0; i < w; i++)
        {
            output += "|";
            for(int c = 0; c < l; c++)
            {
                output += "  ";
            }
            output += "|" + newLine;
        }
        output += " ";
        for(int i = 0; i < l; i++)
        {   
            output += "‾‾";
        }
    }
    
    Boxx(int l, int w, int h)
    {
        //math for things
        length = l;
        width = w;
        height = h;
        output = "Length is: " + length  + " units, Width is: " + width + " units, Height is: " + height + " units, the Volume is: " + length * width * height + " units³, and the Surface Area is: " + 2 * (length * height) + 2 * (height * width) + 2 * (length * width) + " units";
    }
}
