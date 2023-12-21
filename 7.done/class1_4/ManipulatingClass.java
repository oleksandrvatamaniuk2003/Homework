package class1_4;

public class ManipulatingClass {
    public void manipulateData(ClassWithProtectedData obj) {
        int data = obj.getPrivateData();
        System.out.println("Manipulated Data: " + data);
    }
}
