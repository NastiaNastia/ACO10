
public class TestMyString {
    public static void main(String[] args) {
        char[] array1 = {'T', 'a', 's', 't', 'y', ' ', 'p', 'i', 'z', 'z', 'a'};
        MyString content = new MyString(array1);
        content.showMyString();
        System.out.println();

        char[] array2 = {' ', 'w', 'i', 't', 'h', ' ', 'e', 'x', 't', 'r', 'a', ' ', 'c', 'h', 'e', 'e', 's', 'e'};
        MyString content1 = content.concatenate(array2);
        content1.showMyString();
        System.out.println();

        char[] array3 = {'P', 'I', 'Z', 'Z', 'A'};
        MyString content2 = new MyString(array3);
        content2.makeLowerCase();
        content2.showMyString();
        System.out.println();

        char[] array4 = {'p', 'i', 'z', 'z', 'a'};
        MyString content3 = new MyString(array4);
        content3.makeUpperCase();
        content3.showMyString();
        System.out.println();

        System.out.println(content1.findSubstring(array4));

        MyString subContent = content.subMyString(6,10);
        subContent.showMyString();
        System.out.println();

        MyString content4 = content1.deleteSpaces();
        content4.showMyString();



    }
}
