package PracticeTwo;

import PracticeOne.Student;

public class Application {
    public static void main(String[] args) {
        Courses courses = new Courses();

        Student adam = new Student("Adam", 20);
        Student eve = new Student("Eve", 20);
        Student bob = new Student("Bob", 20);

        courses.printList();

        courses.putStudent(adam);
        courses.putStudent(eve);
        courses.putStudent(bob);

        courses.printList();

        courses.dropStudent(2);

        courses.printList();
    }
}
