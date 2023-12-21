package class1_4;

public class ClassWithProtectedData {
    private int privateData;

    public ClassWithProtectedData(int data) {
        this.privateData = data;
    }

    protected int getPrivateData() {
        return privateData;
    }
}
