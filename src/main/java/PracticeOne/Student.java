package PracticeOne;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfomation() {
        return "Student Info:" + "\n\tName:" + this.name + "\n\tAge: " + this.age;
    }
}
