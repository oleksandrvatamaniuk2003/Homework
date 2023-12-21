import java.util.Random;

public class ComplicatedCode {
    public static void main(String[] args) {
        int totalIterations = 9999999;
        int aliceWinsCount = 0;
        for (int iteration = 0; iteration < totalIterations; iteration++) {
            int aliceCount = 0;
            int bobCount = 0;
            boolean aliceCondition1 = false;
            boolean aliceCondition2 = false;
            boolean bobCondition = false;
            Random random = new Random();

            while (true) {
                boolean coinDrop = random.nextBoolean();

                if (coinDrop && aliceCondition1) {
                    aliceCondition2 = true;
                } else if (coinDrop && !aliceCondition1) {
                    aliceCondition1 = true;
                } else {
                    aliceCondition1 = false;
                    aliceCondition2 = false;
                }

                coinDrop = random.nextBoolean();

                if (!coinDrop && bobCondition) {
                    break;
                } else if (coinDrop && bobCondition) {
                    bobCondition = false;
                } else if (coinDrop && !bobCondition) {
                    bobCondition = true;
                }

                if (aliceCondition2) {
                    aliceWinsCount++;
                    break;
                }
            }

            if (aliceCount < bobCount) {
                aliceWinsCount++;
            }
        }

        double probability = (double) aliceWinsCount / totalIterations;
        System.out.printf("Result - %f", probability);
    }
}