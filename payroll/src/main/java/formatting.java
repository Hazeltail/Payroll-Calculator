/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tami_portal
 */
public class formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* string is s
        int is d
        float / double is f
        
        */
        System.out.printf("%40s","PAYSLIP"); //40 spaces in
        System.out.printf("%40s","PAYSLIP   \n"); //40 spaces in, then a new line
        System.out.println();
        System.out.printf("Gross Pay:                                ", "%..2f");
    }
    
}
