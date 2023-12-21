public class Dog {
    private String name;
    private String sound;
    public Dog(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
    public void displayInfo() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog says: " + sound);
    }
    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "Ruff!");
        Dog scruffy = new Dog("Scruffy", "Wurf!");
        spot.displayInfo();
        scruffy.displayInfo();
        Dog anotherSpot = spot;
        System.out.println("spot == scruffy: " + (spot == scruffy));
        System.out.println("spot == anotherSpot: " + (spot == anotherSpot));
        System.out.println("spot.equals(scruffy): " + spot.equals(scruffy));
        System.out.println("spot.equals(anotherSpot): " + spot.equals(anotherSpot));
    }
}
