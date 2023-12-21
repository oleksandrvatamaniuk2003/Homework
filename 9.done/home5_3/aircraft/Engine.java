package aircraft;
public class Engine {
    private int horsepower;
    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }
    public void displayEngineDetails() {
        System.out.println("Horsepower: " + horsepower);
    }
}
