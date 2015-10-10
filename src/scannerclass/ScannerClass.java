/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerclass;

/**
 *
 * @author PLATINUM
 */
import java.util.Scanner;
public class ScannerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner name = new Scanner(System.in);
        
        String fname;
        System.out.println("Enter your First Name");
        fname = name.nextLine();
        
        String familyname;
        System.out.println("Enter your  Family Name");
        familyname = name.nextLine();
        
        String allName;
        allName = fname + familyname;
        System.out.println("Your Full Name is  : " + allName);
    }
    
}
