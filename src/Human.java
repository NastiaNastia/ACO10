
public class Human {
    String name;
    int age;
    String sex;

    public Human (String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String toString() {
        return String.format("Hello! I'm Human. My name is %s. I'm %d. I am %s", name, age, sex);
    }

}
