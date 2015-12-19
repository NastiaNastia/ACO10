package HomeworkWeek2;

/* Написать программу позволяющую узнать следующую информацию:
1) посмотреть список читателей
2) посмотреть список доступных книг
3) добавить книгу в библиотеку
4) добавить читателя в список читателей
5) выдать книгу читателю (если книга есть в наличии).
Читателю запрещается брать больше 3-х книг.
6) посмотреть список книг, которые находятся у читателей
7) посмотреть список книг, которые находятся у конкретного читателя
8) добавить читателя в черный список (ему нельзя выдавать книги)
9) посмотреть книги конкретного автора
10) посмотреть новые книги (год издания выше 2013)*/



import java.util.ArrayList;

public class Library {

    ArrayList<Reader> readers = new ArrayList<>();
    ArrayList<Reader> blackListOfReaders = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();

    public void showReaders() {
        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            if (book.getIsBookAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void addBookToLibrary (Book book) {
        books.add(book);
        System.out.println("Book was added to the library.");
    }


    public void addReaderToReadersList(Reader reader) {
        readers.add(reader);
        System.out.println("Reader was added to the Readers list of library.");
    }

    public void giveBookToReader(Reader reader, Book book) {
        if (book.getIsBookAvailable()) {
            if (reader.getBooksOfReader().size() < Reader.limitOfBooks) {
                reader.getBooksOfReader().add(book);
                book.setIsBookAvailable();
            } else {
                System.out.println("You've already have three books. Please, return one for get another.");
            }
        } else {
            System.out.println("Sorry. This book is not available for the moment.");
        }
    }

    public void showBooksOfAllReaders () {
        for (Book book : books) {
            if (!book.getIsBookAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void showBooksOfConcreteReader (Reader concreteReader) {
        for (Book book : concreteReader.getBooksOfReader()) {
            System.out.println(book);
        }
    }


   public  void addReaderToBlackList (Reader naughtyReader) {
     blackListOfReaders.add(naughtyReader);
       System.out.println("The reader was added to black list.");
   }

    public void showBooksOfConcreteAuthor (String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println (book);
            }
        }
    }

    public void showBooksPublishedInExactYear (int yearPublished) {
        for (Book book : books) {
            if (book.getYearPublished() == yearPublished) {
                System.out.print(book);
            }
        }
    }

}
