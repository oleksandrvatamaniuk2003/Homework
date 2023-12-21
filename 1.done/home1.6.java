public class SumaArgymentiv {
    public static void main(String[] args) {
        if (args.length >= 1) {
            double suma = 0.0;

            for (int i = 0; i < args.length; i++) {
                try {
                    double chyslo = Double.parseDouble(args[i]);
                    suma += chyslo;
                } catch (NumberFormatException e) {
                    System.out.println("Pomylka: " + args[i] + " - ne chyslo. Ignoruyemo.");
                }
            }

            System.out.println("Suma vvedenikh dіysnykh chisel: " + suma);
        } else {
            System.out.println("Nedostatn'o argymentiv. Potribno vvesty mizh odnim ta bagat'ma argymentami.");
        }
    }
}
