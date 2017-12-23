
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vc2000
 */
public class DollarsToEuroConverter {
        public static void main (String[] args){
            System.out.print("How many dollars do you want to convert? ");
            Scanner keyboard = new Scanner(System.in);
            double dollars = keyboard.nextDouble();
            System.out.print("What is the euro-per-dollar exchange rate?");
            double eurosPerDollar = keyboard.nextDouble();
            double euros = dollars * eurosPerDollar;
            System.out.println(dollars+"dollars => " + euros + "euros");
            System.out.printf("%.2f dollars => %.2f euros", dollars, euros);
    }
}
