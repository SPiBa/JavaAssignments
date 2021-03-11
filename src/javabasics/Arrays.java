package javabasics;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        //StudentGrades();
        RandomCarDigit();
        //DaysOfTheWeek();
    }

    public static void RandomCarDigit() {
        System.out.println("Enter the number of unique digits you would like in your car number");
        Scanner scan = new Scanner(System.in);
        int noOfDigits = scan.nextInt();
        String[] numPlate = new String[noOfDigits];

        Random random = new Random();
        int i = 0;
        while (i <= noOfDigits - 1) {
            boolean isSame = false;
            //get the 4 digit random number
            String randNum = String.format("%04d",random.nextInt(10000));
            String a = "MH" + randNum;
            //check if the number is unique
            for (int j = 0; j < 1; j++) {
                if (numPlate[j] == a)
                    isSame = true;
            }
            //if unique, add to the string
            if (isSame == false) {
                numPlate[i] = a;
                i = i + 1;
            }
        }
        //print the string
        for (String entry : numPlate)
            System.out.println(entry);
    }

    private static void DaysOfTheWeek() {
        System.out.println("Enter the number to select the day");
        Scanner scan = new Scanner(System.in);
        int intDay = scan.nextInt();
        String weekdays[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (intDay < 7)
            System.out.println(weekdays[intDay-1]);
        else
            System.out.println("Invalid entry");

    }

    private static void StudentGrades (){
        System.out.println("Enter the number of grades to evaluate");
        Scanner scan = new Scanner(System.in);
        int intGrades = scan.nextInt();

        double[] Grades = new double[intGrades];
        double sumGrades = 0.00;

        System.out.println("Enter the grades one by  one");
        for (int i= 0; i<intGrades-1; i++) {
            Grades[i] = scan.nextDouble();
            sumGrades = sumGrades + Grades[i];
        }

        System.out.println("Average of the grades is " + sumGrades/intGrades);

        //find highest and lowest
        double highest = 0;
        double lowest = Grades[0];

        for (int i= 0; i<intGrades-1; i++) {
            if (Grades[i] > highest)
                highest = Grades[i];
            if (Grades[i] < lowest)
                lowest = Grades[i];
        }

        System.out.println("The lowest of the grades is " + lowest);
        System.out.println("The highest of the grades is " + highest);

    }

}