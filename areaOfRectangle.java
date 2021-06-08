/** A program that asks users input and calculates the area of Rectangle **/
// 1. Ask user for value of length and breadth
// 2. Print to users the value they have entered
// 3. Calculate Area of triangle
// 4. Print the results to users

package com.DevubTech;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        // Scanner Class
        Scanner inputLength = new Scanner(System.in);
        Scanner inputBreadth = new Scanner(System.in);

        //Method for Length input
        System.out.print("Enter the Length: ");
        int num1 = inputLength.nextInt();
        System.out.println("You have entered: " + num1 + " as your length");

        //Method for Breadth input
        System.out.print("Enter the Breadth: ");
        int num2 = inputBreadth.nextInt();
        System.out.println("You have Entered: " + num2 + " as your breadth");

        // Calculating
        System.out.println("Calculating.......");

        // Print Results to users
        int num3 = num1 * num2;
        System.out.println("The Area of the Rectangle is " + num3);
        
    }

}
