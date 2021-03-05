package jpl2;

import java.util.Scanner;

public class JPL2
{

    public static void main(String[] args) 
    {
       
        Scanner L = new Scanner(System.in);
        Scanner W = new Scanner(System.in);
        Scanner H = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("(Y = yes N = no)");
        System.out.println("Do you want to play with shapes?");
        String checkInput = input.nextLine().toUpperCase();
        if(checkInput.substring(0,1).contains("Y"))
        {
            System.out.println("Do you wish to make a line?");
            checkInput = input.nextLine().toUpperCase();
            if(checkInput.substring(0,1).contains("Y"))
            {   
                System.out.println("What is the length?");
                Boxx line = new Boxx(L.nextInt());
                System.out.println(line.output);
            }
            
            System.out.println("Do you wish to make a box?");
            checkInput = input.nextLine().toUpperCase();
            if(checkInput.substring(0,1).contains("Y"))
            {   
                System.out.println("What is the length and width");
                Boxx box = new Boxx(L.nextInt(), W.nextInt());
                System.out.println(box.output);
            }
            
            System.out.println("Do you wish to make a cube?");
            checkInput = input.nextLine().toUpperCase();
            if(checkInput.substring(0,1).contains("Y"))
            {   
                System.out.println("What is the length and width and height");
                Boxx cube = new Boxx(L.nextInt(), W.nextInt(), H.nextInt());
                System.out.println(cube.output);
            }
        }  
        
        
        System.out.println("Do you want to read a book?");
        checkInput = input.nextLine().toUpperCase();
        if(checkInput.substring(0,1).contains("Y"))
        {
            System.out.println("L = Last Page N = Next Page STOP = Close Book");
            int goTo = -1;
            Book book = new Book();
            while(!checkInput.equals("STOP"))
            {
                checkInput = input.nextLine().toUpperCase();
                if(checkInput.substring(0,1).contains("N"))
                {
                    goTo++;
                    System.out.println(book.pageChange(goTo));
                }
                
                if(checkInput.substring(0,1).contains("L"))
                {
                    goTo--;
                    System.out.println(book.pageChange(goTo));
                }
            }
        }
        L.close();
        W.close();
        H.close();
        input.close();

    }
}