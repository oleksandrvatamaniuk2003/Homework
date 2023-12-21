package sweets;

public class Candy extends Sweets {
    private String flavor;
    public Candy(String name, double weight, double sugarContent, String flavor) {
        super(name, weight, sugarContent);
        this.flavor = flavor;
    }
    public String getFlavor() {
        return flavor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flavor: " + flavor);
    }
}