package OOPSModel;

import java.util.ArrayList;

public class Books {
    private int bookNo;
    private String isbn;
    private String author;
    private boolean isRented;
    private static int bookCount = 0;
    private static int rentedBookCount = 0;
    private String print;

    public String getIsbn() {
        return this.isbn;
    }

    public Books(int bookNo, String isbn, String author, boolean isRented){
        this.bookNo = bookNo;
        this.isbn = isbn;
        this.author = author;
        this.isRented = isRented;
        bookCount = bookCount + 1;
        if (isRented == true)
            rentedBookCount = rentedBookCount + 1;
    }

    //Print all the book details
    public void displayBookDetails(){
        if (isRented == true)
            print = "is rented";
        else
            print = "is available for renting";
        System.out.println("For book " + this.bookNo + "- ISBN code is " + isbn  + ", author is "+ author+ " and " + print);

    }


    //Print Books that belong to a particular department
    public static ArrayList<Books> getDeptBooks(ArrayList<Books> bookList, String deptName) {
        ArrayList<Books> deptBooks = new ArrayList<>();
        for (Books book : bookList) {
            if (book.getIsbn().contains(deptName)) {
                deptBooks.add(book);
            }
        }
        return deptBooks;

    }

    //Print total number of books
    public static void printTotalBookCount () {
        System.out.println("Total number of books in the library are " + bookCount);
    }

    //Print no of books that are rented
    public static void printNoOfRentedBooks(){
        System.out.println("Total number of books that are currently rented are " + rentedBookCount);
    }


}
