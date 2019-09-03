package week4;

import org.junit.jupiter.api.Test;

class StudentTest {
    @Test
    void basicTest() {
        Student student = new Student();
        student.setIdNumber(2304);
        student.setCreditHours(30);
        student.setPoints(2000);
        System.out.println("id number: " + student.getIdNumber());
        System.out.println("credit hours: " + student.getCreditHours());
        System.out.println("number of points: " + student.getPoints()
        );

    }

    @Test
    void checkGba() {
        Student student = new Student();
        student.setIdNumber(2304);
        student.setCreditHours(30);
        student.setPoints(2000);
        student.gpa();
    }

    @Test
    void initializer() {
        Student student = new Student();
        System.out.println("id number: " + student.getIdNumber());
        System.out.println("credit hours: " + student.getCreditHours());
        System.out.println("number of points: " + student.getPoints());
        student.gpa();
    }
}