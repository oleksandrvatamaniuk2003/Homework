import java.util.Random;

public class RollLoadedDie {
    public static void main(String[] args) {
        int result = rollLoadedDie();
        System.out.println("Resultat pidkydannia kubyka: " + result);
    }
    public static int rollLoadedDie() {
        Random random = new Random();
        double probability = random.nextDouble();
        if (probability < 1.0 / 8) {
            return 1;
        } else if (probability < 2.0 / 8) {
            return 2;
        } else if (probability < 3.0 / 8) {
            return 3;
        } else if (probability < 4.0 / 8) {
            return 4;
        } else if (probability < 5.0 / 8) {
            return 5;
        } else {
            return 6;
        }
    }
}
