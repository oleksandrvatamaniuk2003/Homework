package class2_1;

import java.util.Arrays;

public class TestProgram {
    public static void main(String[] args) {
        Student[] students = Student.createStudentArray();

        // a)
        System.out.println("Students from the Engineering faculty:");
        Student.printStudentsByFaculty(students, "Engineering");

        // b)
        System.out.println("\nStudents from Science, Course 1:");
        Student.printStudentsByFacultyAndCourse(students, "Science", 1);

        // c)
        System.out.println("\nStudents born after 2000:");
        Student.printStudentsBornAfterYear(students, 2000);

        // d)
        System.out.println("\nStudents from group A1:");
        Student.printStudentsByGroup(students, "A1");
    }
}