import mypackage.AccessExampleClass;

public class MainProgramAccessTest {
    public static void main(String[] args) {
        AccessExampleClass example = new AccessExampleClass();
        System.out.println("Public field: " + example.publicField);
        example.publicMethod();

        // System.out.println("Private field: " + example.privateField);
        // example.privateMethod();

        // System.out.println("Protected field: " + example.protectedField);
        // example.protectedMethod();

        System.out.println("Package-private field: " + example.packagePrivateField);
        example.packagePrivateMethod();
    }
}

// rozkomentovuvaty za potreby