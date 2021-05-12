public class Main {
    
    public static void main(String[] args) 
    {
        System.out.println(removeTag("<b>Strings are immutable</b>"));
    }

    public static String removeTag(String inputString)
    {
        String temp = "";
        for(int i = 0; i < inputString.length(); i++)
        {
            if(inputString.charAt(i) == '>')
            {
                for(int c = i; c < inputString.length(); c++)
                {
                    if(inputString.charAt(c) == '<' && inputString.charAt(c+1) == '/')
                    {
                        temp = inputString.substring(i+1, c);
                        return temp;
                    }
                }
            }
        }
        return inputString;
    }
}
