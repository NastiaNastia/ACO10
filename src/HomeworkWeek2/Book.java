package HomeworkWeek2;

public class Book {
    String name;
    String author;
    int yearPublished;
    int numberOfPages;

    public Book (String name, String author,int yearPublished, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
    }

    public String toString () {
        return String.format ("This book is %s of %s.It was published in %d. It consists of %d pages.",
                                                            name, author, yearPublished, numberOfPages );

    }
}
