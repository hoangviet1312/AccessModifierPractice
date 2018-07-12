package PracticeOne;

import org.junit.Test;

public class StudentManagerTest {

    @Test
    public void StudentTest() {
        Student andy = new Student("Andy", 23);
        System.out.println(andy.getName());
        System.out.println("Name: " + andy.getName());
        System.out.println("Age: " + andy.getAge());
    }

    @Test
    public void ManagerTest() {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student andy = new Student("Andy", 23);
        studentManager.add(andy);
        System.out.println("Add student " + andy.getName());
        studentManager.displayAll();

        Student booby = new Student("Booby", 25);
        studentManager.add(booby);
        System.out.println("Add student " + booby.getName());
        studentManager.displayAll();

        Student sammy = new Student("Sammy", 22);
        studentManager.add(sammy);
        System.out.println("Add student " + sammy.getName());
        studentManager.displayAll();
    }
}
