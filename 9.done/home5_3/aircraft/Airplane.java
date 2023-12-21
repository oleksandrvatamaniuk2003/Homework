package aircraft;

public class Airplane {
    private Wing wing;
    private Chassis chassis;
    private Engine engine;
    private String route;
    public Airplane(Wing wing, Chassis chassis, Engine engine) {
        this.wing = wing;
        this.chassis = chassis;
        this.engine = engine;
    }
    public void fly() {
        System.out.println("The airplane is flying.");
    }
    public void setRoute(String route) {
        this.route = route;
    }
    public void displayRoute() {
        System.out.println("Current Route: " + route);
    }
}
