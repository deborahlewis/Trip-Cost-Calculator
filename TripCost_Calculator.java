/*
 * Deborah Lewis
 * August 11, 2016
 * 
 * This program requests the current gas price and mileage of trip
 * then calculates the cost of the trip for the car and the van.
 */
package TripCost_Calculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;


public class TripCost_Calculator {

    public static void main(String[] args) {
        //variables
        int milesToDrive;
        double gasPrice;
        
        final int milesPerGallonVan = 22;
        final int milesPerGallonCar = 29;
        
        double costOfTripVan;
        double costOfTripCar;
        
        //user input
        gasPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter current gas price: "));
        milesToDrive = Integer.parseInt(JOptionPane.showInputDialog(null, "How many miles will you drive: "));
        
        //calculations
        costOfTripVan = (milesToDrive * gasPrice) / milesPerGallonVan;
        costOfTripCar = (milesToDrive * gasPrice) / milesPerGallonCar;
        
        NumberFormat twoDecimals = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, "Cost of Trip\n\nCAR: $" + twoDecimals.format(costOfTripCar) + "\nVAN: $" + twoDecimals.format(costOfTripVan));
        
    }
    
}
