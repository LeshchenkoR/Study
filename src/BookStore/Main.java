package BookStore;

import static BookStore.Book.addBook;
import static BookStore.Book.printAllBookList;

public class Main {
    public static void main(String[] args) {

        Book[] bookList = new Book[99];

        Book book1 = new Book();

        book1.bookName = "The Hobbit";
        book1.bookPrice = 999;
        book1.editionYear = 1937;

        addBook(bookList, book1);

        Book book2 = new Book();
        book2.bookName = "The Hobbit1";
        book2.bookPrice = 999;
        book2.editionYear = 1937;

        addBook(bookList, book2);
        printAllBookList(bookList);
    }
}
