package PracticeTwo;

import java.util.ArrayList;

import PracticeOne.Student;

public class Courses {
    private static final int DEFAULT_SIZE = 100;
    private ArrayList<Student> students = new ArrayList<>(DEFAULT_SIZE);

    public void dropStudent(int index) {
        System.out.println("Student " + students.get(index).getName() + " removed.\n");
        students.remove(index);
    }

    public void putStudent(Student student) {
        System.out.println("Student " + student.getName() + " added.\n");
        students.add(student);
    }

    public void printList() {
        if (students.isEmpty()) {
            System.out.println("The list is empty.\n");
        } else {
            System.out.println("Student in list:");
            for (Student student : students) {
                System.out.println(student.getName());
            }
            System.out.println();
        }
    }

    public void clear() {
        System.out.println("The list is now empty.\n");
        students = new ArrayList<>();
    }
}
