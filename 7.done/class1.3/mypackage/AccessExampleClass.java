package mypackage;

public class AccessExampleClass {
    public int publicField = 10;

    private int privateField = 20;

    protected int protectedField = 30;

    int packagePrivateField = 40;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void packagePrivateMethod() {
        System.out.println("This is a package-private method.");
    }
}
