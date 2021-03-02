package Assignments;

import java.util.Scanner;
import java.util.SortedMap;

public class Operators {
    public static void main(String[] args) {
        PerimeterAndAreaOfRectangle();
        PerimeterOfTriangle();
        FahrenheitToCelsius();


    }
    static void PerimeterAndAreaOfRectangle (){
        System.out.println("Calculate the Area and Perimeter of Rectangle");

        //Enter the inputs
        int varLength = 5, varBreadth = 7;

        //Calculate the perimeter and Area
        int area = varBreadth*varLength;
        int perimeter = 2 *(varBreadth + varLength);

        //display results
        System.out.println("The Area of the rectangle is "+ area + " and the perimeter is "+ perimeter);
    }

    static void PerimeterOfTriangle (){
        System.out.println("Calculate the perimeter of a triangle");

        //Enter the inputs
        int side1 = 2, side2= 3, side3 = 5;

        //Calculate the perimeter
        int perimeter = side1 + side2 + side3;

        //display results
        System.out.println("The Perimeter of the given triangle is " + perimeter);
    }

    static void FahrenheitToCelsius () {

        System.out.println("Convert temperature from Fahrenheit to celsius");

        //enter the input
        System.out.println("Enter the temperature in Fahrenheit which you want to convert to Celsius");
        Scanner scan = new Scanner(System.in);
        double tempF = scan.nextDouble();
        scan.close();

        //Convert to Calsius
        double tempC = (tempF - 32) * 5/9;

        //Display results
        System.out.println("The converted temperature in Celsius is " + tempC);

    }


}


