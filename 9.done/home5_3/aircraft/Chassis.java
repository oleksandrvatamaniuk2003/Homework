package aircraft;
public class Chassis {
    private int numberOfWheels;
    public Chassis(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public void displayChassisDetails() {
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
