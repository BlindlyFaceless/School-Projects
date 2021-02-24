
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPL1 {
    
    /**
     *
     */
    
    public static void main(String[] args) 
    {
        //coin counter
        Double Quarters = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Quarters (Please Enter Numbers Only)")));
        Double Dimes = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Dimes (Please Enter Numbers Only)")));
        Double Nickels = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Nickels (Please Enter Numbers Only)")));
        Double Pennies = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Pennies (Please Enter Numbers Only)")));
        DecimalFormat formating = new DecimalFormat("######.##");
        
    
        Double sum = (Quarters * 0.25 + Dimes * 0.1 + Nickels * 0.05 + Pennies * 0.01);
    
        System.out.println("$" + formating.format(sum));
        System.out.println("Next is Sphere Math (Surface Area and Volume)");

        //sphere math
        Double Radius = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Radius in Meters (Please Enter Numbers Only)")));

        Double sphereVolume = (4/3) * Math.PI * Math.pow(Radius, 3);
        Double surfaceArea = 4 * Math.PI * Math.pow(Radius, 2);

        System.out.println("Volume is: " + sphereVolume + " Meters, Surface Area is: " + surfaceArea);
        System.out.println("Next is Triangle Math (Area)");

        //triangle math
        Double sideA = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Side Length A in Meters (Please Enter Numbers Only)")));
        Double sideB = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Side Length B in Meters (Please Enter Numbers Only)")));
        Double sideC = Double.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Side Length C in Meters (Please Enter Numbers Only)")));

        Double perim = (sideA + sideB + sideC)/2.0;
        Double area = Math.sqrt(perim * (perim - sideA) * (perim - sideB) * (perim - sideC));

        System.out.println("Area is " + area + " Meters");
        System.out.println("Code by Conner Lavineway");
    } 
}



