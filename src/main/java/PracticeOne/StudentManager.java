package PracticeOne;

import java.util.Arrays;

public class StudentManager {
    private Student[] students = new Student[20];
    private int counter;

    public void add(Student student) {
        if (counter == students.length) {
            ensureCapacity();
        }
        this.students[counter] = student;
        counter++;
    }

    public void displayAll() {
        if (students.length == 0) {
            System.out.println("There is no student in list");
        } else {
            System.out.println("There are " + counter + " student in list");
            for (int i = 0; i < counter; i++) {
                System.out.println(students[i].getInfomation());
                System.out.println();
            }
            System.out.println();
        }
    }

    private void ensureCapacity() {
        students = Arrays.copyOf(students, students.length * 2);
    }
}
