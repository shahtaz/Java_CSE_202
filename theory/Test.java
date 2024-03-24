class Book{
    
    //atributes
    public String title;
    public String author;
    public int id;

    //constructor
    public Book(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
    }

    //display method
    @Override
    public String toString() {
        return '\n' + "Title :: " + title  + '\n' +  "Author:: " + author + '\n' + "ID :: " + id + '\n';
    }

}

class User{
    //atributes
    public String name;
     final public int membershipID;

    //constructor
    User(String name, int membershipID){
        this.name = name;
        this.membershipID = membershipID;
    }

    //display method
    @Override
    public String toString() {
        return '\n' + "Name :: " + name + '\n' + "Membership ID :: " + membershipID;
    }
    
}

class LibraryUser extends User{
    
    // num. of book that have been borrowed
    int brrowedBooks;

    LibraryUser(String name, int membershipID, int borrowedBooks){
        super(name, membershipID);
        this.brrowedBooks = borrowedBooks;
    }

    void borrowbook(int id){
        System.out.println("Issuing book id ...." + id );
        brrowedBooks++;
    }

    void borrowbook(Book b){
        System.out.println("issuing  book");
        System.out.println(b);
        brrowedBooks++;
    }

    Book authorname (Book b){

     System.out.println( '\n' +"The writer of the " +b.title + " is " + b.author);

        return b;
    }

    @Override
    public String toString() {
        return '\n' + "Name :: " + name + '\n' + "Membership ID :: " + membershipID + '\n' +"Borrowed Books:: " + brrowedBooks;
    }

}


public class Test {

    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("...........working.............");
        System.out.println("-------------------------------");

        //creating a book object;
        Book b1 = new Book("Harry Potter", "J. K. Rowling", 8290);

        //creating a library user;
        LibraryUser u1 = new LibraryUser("shahtaz", 22201069, 0);

        //using methods from LibreayUser class 
        u1.borrowbook(b1);

        u1.borrowbook(b1.id);
 
        u1.authorname(b1);

        System.out.println(u1);

    }
}