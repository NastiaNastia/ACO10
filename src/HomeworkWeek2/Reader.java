package HomeworkWeek2;

import java.util.ArrayList;

public class Reader {
    private String name;
    private int age;
    private ArrayList <Book> booksOfReader = new ArrayList<>();
    public static final int limitOfBooks = 3;
    private boolean isInBlackList = false;


    public Reader (String name, int age) {
        this.name = name;
        this.age = age;
    }

public String toString () {
    return String.format("This is %s. He's %d.", name, age);
}

    public String getName () {
        return name;
    }

    public  int getAge () {
        return age;
    }

    public ArrayList<Book> getBooksOfReader () {
        return booksOfReader;
    }

    public boolean getIsInBlackList () {
        return isInBlackList;
    }

}
