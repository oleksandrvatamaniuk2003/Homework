public class YedynyyZrazok {
    // Statychnyi element, shcho zagal'ne dlya vsikh ekzempliariv klasi
    private static int statychnyiElement = 0;

    // Polya ekzempliara (ne statychni)
    private int polyaEkzempliara;

    // Konstruktor
    public YedynyyZrazok(int polyaEkzempliara) {
        this.polyaEkzempliara = polyaEkzempliara;
        statychnyiElement++;
    }

    // Metod dlya otrymannya znachen' statychnogo ta poliv ekzempliara
    public void drukuvatyPolia() {
        System.out.println("Statychnyi Element: " + statychnyiElement);
        System.out.println("Polia Ekzempliara: " + polyaEkzempliara);
        System.out.println();
    }

    public static void main(String[] args) {
        YedynyyZrazok obj1 = new YedynyyZrazok(10);
        YedynyyZrazok obj2 = new YedynyyZrazok(20);
        YedynyyZrazok obj3 = new YedynyyZrazok(30);

        // Drukuvaly polia dlya kozhnogo ob'iektu
        obj1.drukuvatyPolia();
        obj2.drukuvatyPolia();
        obj3.drukuvatyPolia();
    }
}
