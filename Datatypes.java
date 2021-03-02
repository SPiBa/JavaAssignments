package Assignments;

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        PrintProgram();

        AreaOfRectangle();

        ProductOfNum();

        AsciiValue ();

        ConvertDoubleToInt ();

        AddToAsciiValue ();

        SquareOfNum ();
    }

    static void PrintProgram() {
        System.out.println("Print Int, Double and character on screen");
        //Enter a new integer
        System.out.println("Please enter an integer");
        Scanner scan = new Scanner(System.in);
        int varInt = scan.nextInt();
        System.out.println("The integer entered is " + varInt);

        //Enter a decimal number
        System.out.println("Please enter a decimal number");
        double varDouble = scan.nextDouble();
        System.out.println("The decimal entered is " + varDouble);

        //Enter a character
        System.out.println("Please enter a character");
        char varChar= scan.next().charAt(0);
        System.out.println("The character entered is " + varChar);
    }

    static void AreaOfRectangle() {
        System.out.println("Calculate Area of Rectangle");
        int side1 = 2, side2 = 3;

        //Calculate Area of the rectangle
        int area = side1 * side2;

        //Display the results
        System.out.println("The area of the given rectangle is " + area);
    }

    static void ProductOfNum() {
        System.out.println("Calculate Product of 2 numbers");
        double num1 = 6, num2 = 8.2;

        //Calculate the  product of the numbers
        double result = num1 * num2;

        //Display the  results
        System.out.println("The prodcut of the number is " + result);
    }

    static void AsciiValue () {
        System.out.println("Print ASCII value of character h");

        //character whose ASCII value needs to be printed
        char value = 'h';
        int asciiVal = value;

        System.out.println("ASCII value of h is " + asciiVal);
    }

    static void ConvertDoubleToInt () {
        System.out.println("Convert a given double to integer");

        //initialize the double and convert to integer
        double a = 100.235;
        int convInt = (int)a;

        //display results
        System.out.println("The integer value of the given double variable is "+ convInt);
    }

    static void AddToAsciiValue () {
        System.out.println("Add to ASCII value of character and convert to character");

        //character whose ASCII value needs to be printed
        char value = 'd';
        int asciiVal = value;
        int newVal = asciiVal +3;

        //Convert it to character
        char newChar = (char)newVal;

        //Print the new character
        System.out.println("The character corresponding to the new ASCII value is " + newChar);

    }

    static void SquareOfNum () {
        System.out.println("Print the square of a number");

        //enter the number
        double num = 3.9;
        double sqNum = num * num;

        //Print the result
        System.out.println("The square of the given number is " + sqNum);

    }

}
