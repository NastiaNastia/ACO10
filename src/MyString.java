/* 3. Написать класс строка
    - создание на основе массива символов
    - вывод на экран
    - конкатенация
    - понижение регистра
    - повышение регистра
    - поиск подстроки
    - выделение подстроки
    - удаление пробелов
    - метод для сравнения с другой строкой*/

public class MyString {
    char[] array;

// конструктор 1

    public MyString(char[] array) {

        this.array = array;
    }

// конструктор 2

    public MyString() {

    }

// метод вывод на экран

    public void showMyString() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }

// метод конкатенация

    public MyString concatenate(char[] endOfNewArray) {
        char[] newArray = new char[array.length + endOfNewArray.length];
        int i = 0;
        int length = array.length;
        while (i < array.length) {
            newArray[i] = array[i];
            i++;

        }
        while (i < newArray.length) {
            newArray[i] = endOfNewArray[i - length];
            i++;
        }


        return new MyString(newArray);
    }


// метод понижение регистра

    public void makeLowerCase() {
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toLowerCase(array[i]);
        }
    }

// метод повышение регистра

    public void makeUpperCase() {
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toUpperCase(array[i]);
        }
    }

// метод поиск подстроки

    public boolean findSubstring(char[] array2) {
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            if (array2[0] == array[i]) {
                while (array2[j] == array[i + j] && j < array2.length) {
                    j++;
                }
            }
            return true;
        }
        return false;
    }

// метод выделение строки

    public MyString subMyString(int start, int end) {
        int lengthTemp = array.length - end;
        int length = array.length - lengthTemp - start;
        char[] array2 = new char[length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[start + i];
        }
        MyString anotherMyString = new MyString(array2);
        return anotherMyString;
    }


// метод удаление пробелов

    public MyString deleteSpaces() {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                counter += 1;
            }
        }
        int length = array.length - counter;
        char[] array2 = new char[length];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                array2[j] = array[i];
                j++;
            }
        }
        MyString arrayWithoutSpaces = new MyString(array2);
        return arrayWithoutSpaces;

    }
}

/* метод для сравнения с другой строкой

    public MyString compare (char[]somearray) {
        if (array[0] == somearray[0]) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if ()
        }
    }
}
*/