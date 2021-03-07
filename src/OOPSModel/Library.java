package OOPSModel;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

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
        System.out.println("The department code of Library is "+lib.deptCode);
        for (Books bk: lib.book)
            bk.displayBookDetails();
        for (Furniture ft:lib.furniture)
            ft.displayFurnitureDetails();
        for (Staff sf: lib.staff)
            sf.displayStaffDetails();

    }


}

