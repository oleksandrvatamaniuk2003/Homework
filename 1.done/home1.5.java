public class DrukuvatyArgymenty {
    public static void main(String[] args) {
        // Pereviryayemo chi isnuyut argymenty komandnogo rjadka
        if (args.length >= 3) {
            // Drukuemo argymenty
            System.out.println("Pershyi argyment: " + args[0]);
            System.out.println("Druhyi argyment: " + args[1]);
            System.out.println("Tretiyi argyment: " + args[2]);
        } else {
            System.out.println("Nedostatn'o argymentiv. Potribno vvesty mizh tr'oma argymentami.");
        }
    }
}
// java DrukuvatyArgymenty arg1 arg2 arg3 - komanda
