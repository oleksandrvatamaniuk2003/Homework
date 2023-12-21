package aircraft;

public class Wing {
    private int wingSpan;
    public Wing(int wingSpan) {
        this.wingSpan = wingSpan;
    }
    public void displayWingDetails() {
        System.out.println("Wing Span: " + wingSpan);
    }
}
