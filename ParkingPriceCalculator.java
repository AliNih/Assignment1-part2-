/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingpricecalculator;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        double minutes;
        double tarif = 2;
        System.out.print("Please input the number of minutes your car has parked : ");
        minutes = myObj.nextInt();
        double hour = Math.ceil(minutes/60);
        double price = hour*tarif;
        
        System.out.printf("\n%-15s : ","Parking time (minutes)");
        System.out.printf("%1s",(int)minutes);    
        System.out.printf("\n%-22s : ","Parking time (hour)");
        System.out.printf("%1s",(int)hour); 
        System.out.printf("\n%-22s : ","Price");
        System.out.printf("%1.2f\n",price);
    }
    
}
