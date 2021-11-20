/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestatisticcalculator;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class SimpleStatisticCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Please input 5 numbers separated by space : ");
        double num1 = myObj.nextDouble();
        double num2 = myObj.nextDouble();
        double num3 = myObj.nextDouble();
        double num4 = myObj.nextDouble();
        double num5 = myObj.nextDouble();
        double mean = (num1+num2+num3+num4+num5)/5;
        double min = Math.min(num1,Math.min(num2, Math.min(num3, Math.min(num4, num5))));
        double max = Math.max(num1,Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        double sigma = Math.pow(num1-mean, 2)+ Math.pow(num2-mean, 2)+ Math.pow(num3-mean, 2)+ Math.pow(num4-mean, 2)+ Math.pow(num5-mean, 2);
        double dev = Math.sqrt(sigma/5);
                
        System.out.printf("\n%-18s %1s %1.2f, %1.2f, %1.2f, %1.2f, %1.2f", "Numbers", ":" , num1, num2, num3, num4, num5);
        System.out.printf("\n%-18s : ","Mean");
        System.out.printf("%1.2f", mean);
        System.out.printf("\n%-18s : ","Minimum");
        System.out.printf("%1.2f",min);
        System.out.printf("\n%-18s : ","Maximum");
        System.out.printf("%1.2f",max);
        System.out.printf("\n%-15s : ","Standard Deviation");
        System.out.printf("%1.2f\n",dev);
    }
    
}
