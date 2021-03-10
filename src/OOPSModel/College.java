package OOPSModel;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class College {

    public static void main(String[] args) {


        //Enter the books in the library
        ArrayList<Books> bookList = new ArrayList<>();
        bookList.add(new Books(001,"ENGG-01-234","Dennis Ritchie", true));
        bookList.add(new Books(002,"ARTS-08-467", "Julie Griffin", false));
        bookList.add(new Books(003,"ENGG-05-768","B L THEREJA", true));
        bookList.add(new Books(004,"ENGG-01-964","Herbert Schildt", false));
        bookList.add(new Books(005,"ARTS-09-546","David Lynch", true));

        //Enter the furniture details of the college
        ArrayList<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture(1,"Chair","Wood","EnggLibrary"));
        furnitureList.add(new Furniture(2,"Table","Wood","EnggLibrary"));
        furnitureList.add(new Furniture(3,"Rack","Iron","EnggLibrary"));
        furnitureList.add(new Furniture(4,"Chair","Wood","Lab"));
        furnitureList.add(new Furniture(5,"Table","Iron","Lab"));
        furnitureList.add(new Furniture(6,"Chair","Wood","MusicRoom"));
        furnitureList.add(new Furniture(7,"Chair","Wood","ArtsLibrary"));
        furnitureList.add(new Furniture(8,"Table","Wood","ArtsLibrary"));
        furnitureList.add(new Furniture(9,"Rack","Iron","ArtsLibrary"));


        //Enter the staff details
        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff(1,35,"Lab", "Technician","Lab"));
        staffList.add(new Staff(2,38,"Arts", "Teacher","ArtsClass"));
        staffList.add(new Staff(3, 53,"Asst", "Professor","EnggClass"));
        staffList.add(new Staff(4, 48,"Head", "Librarian","EnggLibrary"));
        staffList.add(new Staff(5, 26,"Junior", "Librarian","ArtsLibrary"));

        //Add a library
        Library LibEngg = new Library("ENGG",
                (Books.getDeptBooks(bookList,"ENGG")),
                (Furniture.addDeptFurniture(furnitureList,"EnggLibrary")),
                (Staff.addDeptStaff(staffList,"EnggLibrary")));

        Library LibArts = new Library("ARTS",
                (Books.getDeptBooks(bookList,"ARTS")),
                (Furniture.addDeptFurniture(furnitureList,"ArtsLibrary")),
                (Staff.addDeptStaff(staffList,"ArtsLibrary")));

        //Add a Lab
        Lab LabEngg = new Lab("ENGG",
                (Furniture.addDeptFurniture(furnitureList,"Lab")),
                (Staff.addDeptStaff(staffList,"Lab")));

        //Add a Music Room
        MusicRoom MusicArts = new MusicRoom("ARTS",
                (Furniture.addDeptFurniture(furnitureList,"MusicRoom")),null);

        //DEPARTMENTS - add departments
        Department EnggDepartment = new Department("Engineering",LibEngg,LabEngg,null);
        Department ArtsDepartment = new Department("Arts",LibArts,null,MusicArts);

        //Fetch the number of departments the college has
        System.out.println("The no of departments in the college are " + Department.getNoOfDepartments());


        //print the details of eldest staff member
        Staff.printEldestStaff();

        //Print the total number of staff
        Staff.printTotalStaffCount();

        //Get the number of staff who work in Library
        System.out.println("Total number of staff employed in Library is "  + Staff.noOfStaffPerModule("Library"));

        //LIBRARY

        //BOOKS
        //Get total number of books in college
        Books.printTotalBookCount();

        //Print the number of books that are rented
        Books.printNoOfRentedBooks();

        //Print total number of chairs in college
        Furniture.displayTotalNoOfChairs();

        //Print Library details
        Library.displayLibraryDetails(LibEngg);

    }
}
