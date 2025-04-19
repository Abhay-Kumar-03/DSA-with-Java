public class Book {

    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, String isbn){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you Enjoy");
        } else {
            System.out.println("This is already in Library");
        }
    }

    public static void main(String[] args){
        Book designOfThings = new Book("Design", "Author", "1");
        Book myBook = new Book("1");
        System.out.println(getTotalBooks());
        myBook.borrowBook();
        designOfThings.borrowBook();
        myBook.borrowBook();
        myBook.returnBook();
        designOfThings.returnBook();
        myBook.returnBook();
    }

}
