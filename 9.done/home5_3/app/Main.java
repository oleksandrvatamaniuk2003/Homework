package app;
import aircraft.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of Wing, Chassis, and Engine
        Wing wing = new Wing(30);
        Chassis chassis = new Chassis(3);
        Engine engine = new Engine(300);
        // Create an instance of Airplane using the created objects
        Airplane airplane = new Airplane(wing, chassis, engine);
        // Set route and display it
        airplane.setRoute("City A to City B");
        airplane.displayRoute();
        // Test flying
        airplane.fly();
    }
}
