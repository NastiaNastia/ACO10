package HomeworkWeek2;


import java.util.ArrayList;

public class Library {
    ArrayList<Reader> readers = new ArrayList<>();
    ArrayList<Reader> blackListOfReaders = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Book> givenBooks = new ArrayList<>();

    public void showReaders() {
        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBookToLibrary (Book book) {
        books.add(book);
        System.out.println(book.name + " was added to the library.");
    }


    public void addReaderToReadersList(Reader reader) {
        readers.add(reader);
        System.out.println(reader.name + " was added to the Readers list of library.");
    }

    public void giveBookToReader(Reader reader, Book book) {
        if (books.contains(book)) {
            for (int i = 0; i < reader.booksOfReader.length; i++) {
                if (reader.booksOfReader[i] == null) {
                    reader.booksOfReader[i] = book;
                /* ВОПРОС. НЕ РАГУЛЬНОЕ ЛИ СЛЕДУЮЩЕЕ ДЕЙСТВИЕ, если предварительно написать следующий метод?
                        book.removeBook(book);
                    public void removeBook (Book book) {
                    books.remove(book);
                    System.out.println(book + " was removed from library.");
                    }*/
                    books.remove(book);
                    givenBooks.add(book);
                    break;

                } else {
                    System.out.println("You've already got 3 books. You must return one for get new.");
                }
            }
        } else {
            System.out.println("This book is not available at the moment.");
        }
    }

    public void showGivenBooks () {
        for (Book book : givenBooks) {
            System.out.println(book);
        }
    }

    public void showBooksOfConcreteReader (Reader concreteReader) {
        for (int i = 0; i < concreteReader.booksOfReader.length; i++) {
            System.out.println(concreteReader.booksOfReader[i] + " , ");
        }
    }

   public  void addReaderToBlackList (Reader naughtyReader) {
     blackListOfReaders.add(naughtyReader);
       System.out.println("Tre reader" + naughtyReader.name + "was added to black list.");
   }

    public void showBooksOfConcreteAuthor (String authorsName) {
        for (Book book : books) {
            if (book.author.equals(authorsName)) {
                System.out.println(book + " , ");
            }
        }
    }

    public void showBooksPublishedInExactYear (int yearPublished) {
        for (Book book : books) {
            if (book.yearPublished == yearPublished) {
                System.out.println(book.name + " , ");
            }
        }
    }

}
