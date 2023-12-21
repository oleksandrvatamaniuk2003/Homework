package class1_4;

public class MainProgram {
    public static void main(String[] args) {
        ClassWithProtectedData obj1 = new ClassWithProtectedData(42);
        ManipulatingClass obj2 = new ManipulatingClass();
        obj2.manipulateData(obj1);
    }
}
