/*
 * Deborah Lewis
 * August 11, 2016
 * Updated: Aug 21, 2016
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
        double milesPerGallon;
        
        double costOfTrip;
        
        //user input
        gasPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter current gas price: "));
        milesPerGallon = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your vehicle's fuel economy is avg MPG: "));
        milesToDrive = Integer.parseInt(JOptionPane.showInputDialog(null, "How many miles will you drive: "));
        
        //calculations
        costOfTrip = (milesToDrive * gasPrice) / milesPerGallon;
        
        NumberFormat twoDecimals = new DecimalFormat("#0.00");
        JOptionPane.showMessageDialog(null, "Cost of Trip: $" + twoDecimals.format(costOfTrip));
        
    }
    
}
