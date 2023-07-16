package oops_java;

public class Library1 {
    String[] book;
    int no_of_book;

    Library1() {
        this.book = new String[100];
        this.no_of_book = 0;
    }

    void addBook(String book) {
        this.book[no_of_book] = book;
        no_of_book++;
        System.out.println(book + " has been added");

    }

    void showAvailableBook() {
        System.out.println("Available books are : ");
        int n_book = 1;
        for (String book : this.book) {
            if (book == null) {
                continue;
            }
            System.out.println(n_book + ". " + book);
            n_book++;

        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.book[i] = null;
                return;
            }
            System.out.println("The book does not exist!");
        }

    }

    void returnBook(String book) {
        addBook(book);

    }
}
