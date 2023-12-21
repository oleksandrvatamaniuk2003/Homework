import java.util.Random;

public class ARandomClassification {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int randomNumber1 = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);
            if (randomNumber1 > randomNumber2) {
                System.out.println(randomNumber1 + " > " + randomNumber2);
            } else if (randomNumber1 < randomNumber2) {
                System.out.println(randomNumber1 + " < " + randomNumber2);
            } else {
                System.out.println(randomNumber1 + " = " + randomNumber2);
            }
        }
    }
}
