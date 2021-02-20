/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tami_portal
 */
import java.util.Scanner;
public class prmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
          double taxdeduct = 0;
          double netpay = 0;
          double FSS = 0;
          double FMC = 0;
          double HIP = 0;
          double ODD = 0;
          double TD = 0;
          System.out.println("Enter your gross pay.");
          double grosspay = input.nextDouble();
          if (grosspay >= 43200) {
            taxdeduct = grosspay * 0.37;
          } else if (grosspay >= 17300) {
            taxdeduct = grosspay * 0.35;
          } else if (grosspay >= 13600) {
            taxdeduct = grosspay * 0.32; 
          } else if (grosspay >= 7200) {
            taxdeduct = grosspay * 0.24;
          } else if (grosspay >= 3500) {
            taxdeduct = grosspay * 0.22;
          } else if (grosspay >= 1000) {
            taxdeduct = grosspay * 0.21;
          } else {
            taxdeduct = grosspay * 0.10;
          }
          FSS = grosspay * 0.062;
          FMC = grosspay * 0.0145;
          System.out.println("Enter your Health Insurance premium.");
          HIP = input.nextDouble();
          System.out.println("Enter any other deductions, or enter 0 if there are none.");
          ODD = input.nextDouble();
          TD = taxdeduct + FSS + FMC + HIP + ODD;
          netpay = grosspay - TD;
          System.out.println();
          System.out.printf("               PAYSLIP               ");
          System.out.println();
          System.out.println();
          System.out.printf("Gross Pay:                                      "+"$%,.2f",grosspay);
          // System.out.println("Grosspay: $"+grosspay);
          System.out.println();
          System.out.println();
          System.out.printf("               Deductions               ");
          System.out.println();
          System.out.println();
          System.out.printf("Tax:                                            "+"$%,.2f",taxdeduct);
          System.out.println();
          System.out.printf("Fica Social Security:                           "+"$%,.2f",FSS);
          System.out.println();
          System.out.printf("Fica Medicare:                                  "+"$%,.2f",FMC);
          System.out.println();
          System.out.printf("Health Insurance Premium:                       "+"$%,.2f",taxdeduct);
          System.out.println();
          System.out.printf("Other Deductions:                               "+"$%,.2f",ODD);
          System.out.println();
          System.out.println();
          System.out.printf("Total Deductions:                               "+"$%,.2f",TD);
          System.out.println();
          System.out.printf("Total Net Pay:                                  "+"$%,.2f",netpay);
          System.out.println();
    }  
}
