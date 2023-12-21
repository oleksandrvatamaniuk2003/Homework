package sweets;
public class Sweets {
    private String name;
    private double weight;
    private double sugarContent;
    public Sweets(String name, double weight, double sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getSugarContent() {
        return sugarContent;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Sugar Content: " + sugarContent + "%");
    }
}
