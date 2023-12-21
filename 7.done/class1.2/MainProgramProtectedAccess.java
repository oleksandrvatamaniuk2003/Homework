import mypackage.MyClassWithProtectedMethod;

public class MainProgramProtectedAccess {
    public static void main(String[] args) {
        MyClassWithProtectedMethod myClassInstance = new MyClassWithProtectedMethod();
        myClassInstance.protectedMethod();
    }
}
