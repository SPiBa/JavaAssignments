package javabasics;

import java.util.Scanner;

public class InputByUser {
    public static void main(String[] args) {

        SumAndProductOf2Integers ();
        SumAndProductOfSumAndProduct();
        AreaOfRectangleAsInteger ();

    }

    static void SumAndProductOf2Integers (){
        System.out.println("Sum and Product of 2 integers entered by user");

        //Enter inputs
        System.out.println("Enter the first integer");
        Scanner scan = new Scanner(System.in);
        int int1 = scan.nextInt();
        System.out.println("Enter the second integer");
        int int2 = scan.nextInt();

        //Calculate the sum and product
        int intSum = int1 + int2;
        int intProd = int1 * int2;

        //Print the results
        System.out.println("The sum of the two integers is " + intSum + " and product of integers is "+ intProd);
    }

    static void SumAndProductOfSumAndProduct(){
        System.out.println("Sum and Product of the sum and product of 2 integers entered by user");

        //Enter inputs
        System.out.println("Enter the first integer");
        Scanner scan = new Scanner(System.in);
        int int1 = scan.nextInt();
        System.out.println("Enter the second integer");
        int int2 = scan.nextInt();

        //Calculate the sum and product
        int intSum = int1 + int2;
        int intProd = int1 * int2;

        //Calculate the sum and product of the results
        int sumRes = intSum + intProd;
        int prodRes = intSum * intProd;

        //Print the results
        System.out.println("The sum of the results is " + sumRes + " and product of the results is "+ prodRes);
    }

    static void AreaOfRectangleAsInteger(){

        System.out.println("Calculate Area of Rectangle and display as integer");

        System.out.println("Enter the length of the rectangle as double");
        Scanner scan = new Scanner(System.in);
        double dbLen = scan.nextDouble();
        System.out.println("Enter the breadth of the rectangle as double");
        double dbBreadth = scan.nextDouble();
        scan.close();

        //Calculate Area of the rectangle
        double area = dbBreadth * dbLen;

        //convert to integer
        int intArea = (int)area;

        //Display the results
        System.out.println("The area of the given rectangle as an integer is " + intArea);


    }

}
