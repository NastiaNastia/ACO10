package HomeworkWeek2;

import java.util.ArrayList;

public class TestLibrary {
    public static void main(String[] args) {

     Library coolLibrary = new Library();

        ArrayList<Reader> readers = new ArrayList<>();
        ArrayList<Reader> blackListOfReaders = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

     Book firstBook = new Book("War and Peace", "Leo Tolstoy", 1869);
     Book secondBook = new Book("Anna Karenina", "Leo Tolstoy", 1877);
     Book thirdBook = new Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866);
     Book fourthBook = new Book("Fify Shades of grey", "E. L. James", 2011);

        Reader firstReader = new Reader("Ivan", 18);
        Reader secondReader = new Reader("Georgiy", 35);
        Reader thirdReader = new Reader("David", 26);

/*        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());
        System.out.println(thirdBook.toString());
        System.out.println(fourthBook.toString());

        System.out.println(firstReader.toString());
        System.out.println(secondReader.toString());
        System.out.println(thirdReader.toString());
*/
        coolLibrary.addBookToLibrary(firstBook);
        coolLibrary.addBookToLibrary(secondBook);
        coolLibrary.addBookToLibrary(thirdBook);
        coolLibrary.addBookToLibrary(fourthBook);

        coolLibrary.addReaderToReadersList(firstReader);
        coolLibrary.addReaderToReadersList(secondReader);
        coolLibrary.addReaderToReadersList(thirdReader);

//        coolLibrary.showAvailableBooks();

//        coolLibrary.showReaders();

/*        coolLibrary.giveBookToReader(firstReader, firstBook);
        coolLibrary.giveBookToReader(firstReader, secondBook);
        coolLibrary.giveBookToReader(firstReader, thirdBook);
        coolLibrary.giveBookToReader(firstReader, fourthBook);

        coolLibrary.giveBookToReader(secondReader, firstBook);
*/
//        coolLibrary.showBooksOfConcreteReader(firstReader);

//        coolLibrary.addReaderToBlackList(thirdReader);

        coolLibrary.showBooksOfConcreteAuthor("Leo Tolstoy");

        coolLibrary.showBooksPublishedInExactYear(2011);

//        coolLibrary.showAvailableBooks();

//        coolLibrary.showBooksOfAllReaders();
    }
}
