/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Please input a birth year : ");
        String year = myObj.nextLine();
         String century1 = year.substring(0,(year.length()/2));
         String decade1 = year.substring(year.length()-2, year.length()-1);
        int century2 = Integer.parseInt(century1,10)+1; 
        int decade2 = Integer.parseInt(decade1,10)*10;
        
        System.out.printf("\n%-15s : ","Birth Year");
        System.out.printf("%1s",year);
        System.out.printf("\n%-15s : ","Century");
        System.out.printf("%1s",century2);
        System.out.printf("\n%-15s : ","Decade");
        System.out.printf("%1s\n",decade2);  
    }
    
}
