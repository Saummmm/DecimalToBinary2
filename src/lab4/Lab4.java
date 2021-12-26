/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author saum
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter number to convert to binary: ");
        int number = myScanner.nextInt();

        System.out.println("Here is " + number + " in binary: " + toBinary(number));
        //outputs the binary answer
    }

    public static String toBinary(double number) {
        // if number equals 0, returns base case
        if (number/2 == 0) {
            return "0"; //base case
        } else {
            //Converts integer to string and concatanates it to variable
            //Also taking the remainder of the number divided by zero
            String ans = String.format("%.0f", number % 2);
            System.out.println(ans);
            //recursive function call back
            return toBinary(Math.floor(number / 2)) + ans;
        }
    }

}
