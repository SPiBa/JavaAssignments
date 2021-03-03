package JavaAdvanced;

public class Laptop {

        final String name;
        final double price;
        final String processor;
        final String ram;
        final String hdd;

        public Laptop (String name, double price, String processor, String ram, String hdd){
            this.name  = name;
            this.price = price;
            this.processor = processor;
            this.ram =  ram;
            this.hdd = hdd;
        }

        public void PrintLaptopDetails (){
            System.out.println("Name : " + this.name);
            System.out.println("Price : " + this.price);
            System.out.println("Processor : " + this.processor);
            System.out.println("RAM : " + this.ram);
            System.out.println("HDD : " + this.hdd);
            System.out.println( "******************************");
        }

}
