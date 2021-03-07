package javabasics;

import java.util.Scanner;

public class ConditionalStatements {

        public static void main(String[] args) {
            CheckIfSquare ();
            GreaterOfTwoNumbers();
            TotalCost();
            TotalBonus();
            GradeOfStudent();
            OldestAndYoungest ();
            AbsoluteValue();
            IsFitToTakeExams();
            IsFitToTakeExamsWithMedCertificate();
            EvaluationOfExpressions();
            CheckCase();
        }

        static void CheckIfSquare(){
            System.out.println("Check for square");

            //Enter inputs
            System.out.println("Enter the length of the quadrilateral");
            Scanner scan = new Scanner(System.in);
            int int1 = scan.nextInt();
            System.out.println("Enter the breadth of the quadrilateral");
            int int2 = scan.nextInt();

            if (int1 == int2)
                System.out.println("The quadrilateral is a square");
            else
                System.out.println("The quadrilateral is not a square");

        }
        static void GreaterOfTwoNumbers(){

            System.out.println("Greater of two numbers");

            //Enter inputs
            System.out.println("Enter the first number");
            Scanner scan = new Scanner(System.in);
            int int1 = scan.nextInt();
            System.out.println("Enter the second number");
            int int2 = scan.nextInt();

            //Check condition
            if (int1 > int2)
                System.out.println("First number " + int1 + " is greater than the second number " + int2);
            else if (int2 > int1)
                System.out.println("Second number " + int2 + " is greater than the first number " + int1);

        }
        static void TotalCost(){
            System.out.println("Total cost for the customer");

            //Enter inputs
            System.out.println("Enter the quantity  to be purchased");
            Scanner scan = new Scanner(System.in);
            int qnty = scan.nextInt();
            System.out.println("Enter the cost  per unit");
            double cost = scan.nextDouble();

            double t_cost =  cost * qnty;

            if (t_cost > 1000){
                t_cost = t_cost * 0.9;
                System.out.println("Customer eligible for 10% discount, total cost is " + t_cost);
            } else
                System.out.println("Total cost is "+ t_cost);

        }
        static void TotalBonus(){
            System.out.println("Total bonus of the employee");

            //Enter inputs
            System.out.println("Enter the number of years of experience");
            Scanner scan = new Scanner(System.in);
            double yrsOfExp = scan.nextDouble();
            System.out.println("Enter the salary");
            int salary = scan.nextInt();

            if (yrsOfExp > 5)
                System.out.println(" The total bonus amount is " + (salary * 0.05) );
            else
                System.out.println("Employee not eligible for bonus");
        }


        static void GradeOfStudent(){
            System.out.println("Grade of the student");

            Scanner scan = new Scanner(System.in);
            double marks = scan.nextDouble();

            if (marks < 25)
                System.out.println("Grade: F");
            else if((marks >= 25) && (marks < 45))
                System.out.println("Grade E");
            else if((marks >= 45) && (marks < 50))
                System.out.println("Grade D");
            else if((marks >= 50) && (marks < 60))
                System.out.println("Grade C");
            else if((marks >= 60) && (marks <= 80))
                System.out.println("Grade B");
            else if (marks > 80)
                System.out.println("Grade: A");
            else
                System.out.println("Invalid marks");
        }

    static void OldestAndYoungest (){

        System.out.println("Enter the age of first person");
        Scanner scan = new Scanner(System.in);
        int int1 = scan.nextInt();
        System.out.println("Enter the age of second person");
        int int2 = scan.nextInt();
        System.out.println("Enter the age of third person");
        int int3 = scan.nextInt();

        if ((int1 > int2) && (int1 > int3) && (int2 > int3))
            System.out.println("The eldest of all is the first person and youngest is the third person");
        else if ((int1 > int2) && (int1 > int3) && (int2 < int3))
            System.out.println("The eldest of all is the first person and youngest is the second person");
        else if ((int1 > int2) && (int1 < int3) )
            System.out.println("The eldest of all is the third person and youngest is the second person");
        else if ((int1 < int2) && (int1 < int3)  && (int2 > int3))
            System.out.println("The eldest of all is the second person and youngest is the first person");
        else if ((int1 < int2) && (int1 < int3)  && (int2 < int3))
            System.out.println("The eldest of all is the third person and youngest is the first person");
        else if ((int1 < int2) && (int1 > int3) )
            System.out.println("The eldest of all is the second person and youngest is the third person");

    }
    public static void AbsoluteValue (){
        System.out.println("Print the absolute value of the input number");
        System.out.println("Enter the input number");
        Scanner scan = new Scanner(System.in);
        int intA = scan.nextInt();

        System.out.println("The out is "+ Math.abs(intA));

    }

    public static void IsFitToTakeExams() {
        System.out.println("Print if student is fit to take exams");
        System.out.println("Enter the total number of classes held");
        Scanner scan = new Scanner(System.in);
        int intClasses = scan.nextInt();
        System.out.println("Enter the total number of classes attended");
        int intAttended = scan.nextInt();

        if (intAttended > intClasses)
            System.out.println("Invalid input");
        else {
            double dblPercent = (intAttended / intClasses) * 100;
            if (dblPercent >= 75)
                System.out.println("The percentage attendance of the student is " + dblPercent +".The student qualifies to take the exam");
            else if(dblPercent < 75)
                System.out.println("The percentage attendance of the student is " + dblPercent +".The student does not qualify to take the exam");
        }

    }

    public static void IsFitToTakeExamsWithMedCertificate() {
        System.out.println("Print if student is fit to take exams");
        System.out.println("Enter the total number of classes held");
        Scanner scan = new Scanner(System.in);
        int intClasses = scan.nextInt();
        System.out.println("Enter the total number of classes attended");
        int intAttended = scan.nextInt();

        if (intAttended > intClasses)
            System.out.println("Invalid input");
        else {
            double dblPercent = (intAttended / intClasses) * 100;
            if (dblPercent >= 75)
                System.out.println("The percentage attendance of the student is " + dblPercent +".The student qualifies to take the exam");
            else if(dblPercent < 75){
                System.out.println("Your attendance is less than 75%. Do you have a medical certificate.Enter Y for yes or N for No");
                char varChar= scan.next().charAt(0);
                if (varChar == 'Y')
                    System.out.println("The percentage attendance of the student is " + dblPercent +".With Med certificate, you can take the exam");
                else if (varChar == 'N')
                    System.out.println("The percentage attendance of the student is " + dblPercent +".Since you dont have  Med certificate, you cannot take the exam");
                else
                    System.out.println("Invalid answer");
            }

        }

    }

    public static void EvaluationOfExpressions(){
        System.out.println("Evaluate the given expressions");

        int x = 2;
        int y = 5;
        int z = 0;
        System.out.println("The output of x==2 is " +(x==2));
        System.out.println("The output of x!=5 is " +(x!=5));
        System.out.println("The output of x != 5 && y >= 5 is " +((x != 5) && (y >= 5)));
        System.out.println("The output of z != 0 || x == 2 is " +((z != 0) || (x == 2)));
        System.out.println("The output of !(y < 10) is " +(!(y < 10)));
    }

    public static void CheckCase(){
        System.out.println("Check if the entered alphabet is lower case or upper case");

        System.out.println("Enter the alphabet");
        Scanner scan = new Scanner(System.in);
        char alphabet = scan.next().charAt(0);

        if (alphabet >= 'A' && alphabet <= 'Z')
            System.out.println("The character entered " + alphabet + " is uppercase");
        else if (alphabet >= 'a' && alphabet <= 'z')
            System.out.println("The character entered " + alphabet + " is lowercase");
        else
            System.out.println("Invalid char");
        scan.close();
    }

}
