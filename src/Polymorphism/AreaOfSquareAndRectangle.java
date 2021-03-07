package Polymorphism;

public class AreaOfSquareAndRectangle {
    static void areaOfQuadrilateral(double side){
        double areaSq = side * side;
        System.out.println("Area of the square is " + areaSq);
    }
    static void areaOfQuadrilateral(double length, double breadth){
        double areaRec = length * breadth;
        System.out.println("Area of the rectangle is " + areaRec);
    }

    public static void main(String[] args) {
        areaOfQuadrilateral(2.5);
        areaOfQuadrilateral(5,6);
    }
}
