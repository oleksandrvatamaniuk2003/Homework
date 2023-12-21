package class2_1;

import java.util.Arrays;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String lastName, String firstName, String patronymic,
                   String dateOfBirth, String address, String phoneNumber,
                   String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public static Student[] createStudentArray() {
        return new Student[]{
                new Student(1, "Doe", "John", "Smith", "2000-01-01", "Address1", "123456789", "Engineering", 2, "A1"),
                new Student(2, "Smith", "Jane", "Doe", "1999-02-02", "Address2", "987654321", "Science", 1, "B2"),
                // Add more
        };
    }

    public static void printStudentsByFaculty(Student[] students, String faculty) {
        Arrays.stream(students)
                .filter(student -> student.getFaculty().equalsIgnoreCase(faculty))
                .forEach(System.out::println);
    }

    public static void printStudentsByFacultyAndCourse(Student[] students, String faculty, int course) {
        Arrays.stream(students)
                .filter(student -> student.getFaculty().equalsIgnoreCase(faculty) && student.getCourse() == course)
                .forEach(System.out::println);
    }

    public static void printStudentsBornAfterYear(Student[] students, int year) {
        Arrays.stream(students)
                .filter(student -> Integer.parseInt(student.getDateOfBirth().substring(0, 4)) > year)
                .forEach(System.out::println);
    }

    public static void printStudentsByGroup(Student[] students, String group) {
        Arrays.stream(students)
                .filter(student -> student.getGroup().equalsIgnoreCase(group))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
