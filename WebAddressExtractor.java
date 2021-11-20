/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Please input a web address : ");
        String site = myObj.nextLine();
        int a = site.indexOf('.');
        int b = site.lastIndexOf('.');
         String heading = site.substring(0, a);
         String company = site.substring(a+1, b);
         String extension = site.substring(b+1);
         
        System.out.printf("\n%-15s : ","Address");
        System.out.printf("%1s",site.toLowerCase());
        System.out.printf("\n%-15s : ","Heading");
        System.out.printf("%1s",heading.toLowerCase());
        System.out.printf("\n%-15s : ","Company");
        System.out.printf("%1s",company.toLowerCase());
        System.out.printf("\n%-15s : ","Extension");
        System.out.printf("%1s\n",extension.toLowerCase());
    } 
    
}
