package Polymorphism;

public class Degree {
    public void getDegree (){
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
    public void getDegree (){
        System.out.println("I am an undergraduate");
    }

}

class Postgraduate extends Degree{
    public void getDegree (){
        System.out.println("I am a postgraduate");
    }

}

class Application {
    public static void main(String[] args) {
        Degree myDeg = new Degree();
        myDeg.getDegree();
        Degree myUG = new Undergraduate();
        myUG.getDegree();
        Undergraduate myUG1 = new Undergraduate();
        myUG1.getDegree();
        Postgraduate myPG = new Postgraduate();
        myPG.getDegree();


    }


}

