package Polymorphism;

public class PrintNumber {

    static void printLn (int i){
        System.out.println("Print Integer " + i);
    }
    static void printLn(double d){
        System.out.println("Print Decimal number " + d);
    }
    static void printLn (float f){
        System.out.println("Print float " + f);
    }
    static void printLn (String s){
        System.out.println("Print String " + s);
    }
    static void printLn (Boolean b){
        System.out.println("Print Boolean " + b);
    }

    public static void main(String[] args) {
        printLn(1);
        printLn(12.556);
        printLn("sindhu");
        printLn(Boolean.TRUE);
    }
}



