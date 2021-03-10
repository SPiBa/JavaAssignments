package OOPSModel;

import java.util.ArrayList;

public class Library {
    String deptCode;
    ArrayList<Books> book;
    ArrayList<Furniture> furniture;
    ArrayList<Staff> staff;


    public Library(String deptCode, ArrayList<Books> book, ArrayList<Furniture> furniture, ArrayList<Staff> staff) {
        this.deptCode = deptCode;
        this.book = book;
        this.furniture = furniture;
        this.staff = staff;
    }

    public static void displayLibraryDetails (Library lib){
        System.out.println("The department code of the specified Library is "+lib.deptCode+". The library has the following");

        for (Books bk: lib.book)
            bk.displayBookDetails();
        for (Furniture ft:lib.furniture)
            ft.displayFurnitureDetails();
        for (Staff sf: lib.staff)
            sf.displayStaffDetails();

    }


}

