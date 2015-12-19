package HomeworkWeek2;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int yearPublished;
    private boolean bookIsAvailable = true;

    public Book(String name, String author, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String toString() {
        return String.format("This book is %s. It was written by %s.It was published in %d.",
                name, author, yearPublished);
    }

    public String getName () {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished () {
        return yearPublished;
    }

    public boolean getIsBookAvailable () {
        return bookIsAvailable;
    }

    public boolean setIsBookAvailable () {
        return bookIsAvailable = false;
    }

    @Override

    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!o.getClass().equals(this)) return false;
        Book book = (Book)o;
        if (!book.name.equals(this.name)) return false;
        if (!book.author.equals(this.author)) return false;
        if (book.yearPublished != this.yearPublished) return false;
        return true;
    }

}
