package JavaAdvanced;

public class LaptopDetails extends Laptop{
    public LaptopDetails(String name, double price, String processor, String ram, String hdd) {
        super(name, price, processor, ram, hdd);
    }

    public static void main(String[] args) {
        Laptop lapLenovo = new Laptop("Lenovo", 1000, "i3", "2GB", "500GB" );
        Laptop lapDell = new Laptop("Dell", 1500, "i5", "4GB", "1TB" );
        Laptop lapSony = new Laptop("Sony", 2000, "i9", "8GB", "1TB" );

        //Print laptop details
        lapLenovo.PrintLaptopDetails();
        lapDell.PrintLaptopDetails();
        lapSony.PrintLaptopDetails();
    }
}
