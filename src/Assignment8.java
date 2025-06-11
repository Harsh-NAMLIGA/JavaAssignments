class Book {
    String title;
    String author;
    static int bookCount = 0;

    void printBookInfo() {
        int serialNumber = bookCount + 1;
        bookCount++;

        System.out.println("Serial No: " + serialNumber);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James";

        Book b2 = new Book();
        b2.title = "Python 101";
        b2.author = "Guido";

        b1.printBookInfo();
        b2.printBookInfo();

        System.out.println("Total books added: " + bookCount);
    }
}