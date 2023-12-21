import java.util.Scanner;

public class c1_3 {
    public static void main(String[] args) {
        // Instruktsiya: Skompilyuyte programu z javac ta zapekhte її z dopomogoyu java.
        // Yakscho vy vykorystovuete inshi seredovyshche rozrobky, nizh JDK, diznaytesya,
        // yak kompilyuvaty ta zapuskaty programy v ts'omu seredovyshchi.

        // Otrymannya vkhidnykh danykh vid korystuvacha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedit' shcho-nibud': ");
        String userInput = scanner.nextLine();

        // Vyvedennya rezul'tatu na ekran
        System.out.println("Vy vveli: " + userInput);

        // Zavershennya roboty z ob'ektom Scanner
        scanner.close();
    }
}
