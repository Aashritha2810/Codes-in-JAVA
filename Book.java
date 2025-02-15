class Books{
    String title;
    String author;

    Books( String bookTitle,String  bookAuthor){
        title = bookTitle;
        author = bookAuthor;

    }

    void displayInfo(){
        System.out.println("Title: " + title + " " + "Author: " + author);
    }
}

public class Book {
    public static void main(String[] args) {
        Books books = new Books("Caraval", "Stephanie Garbener");
        books.displayInfo();
    }
}
