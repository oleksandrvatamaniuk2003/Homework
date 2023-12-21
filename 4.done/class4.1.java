public class DecimalRozkladannya {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("vvid 2 tsilikh arhumenty komandnoho riadka: p і q.");
            return;
        }

        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        if (q == 0) {
            System.out.println("Znamennyk q ne mozhе bуtу rіvniy nulyu.");
            return;
        }

        System.out.println(decimalRozkladannya(p, q));
    }

    public static String decimalRozkladannya(int p, int q) {
        if (p % q == 0) {
            return String.valueOf(p / q);
        }
        StringBuilder result = new StringBuilder();
        result.append(p / q).append('.');
        int zalyshok = p % q;
        java.util.HashMap<Integer, Integer> zalyshokMapa = new java.util.HashMap<>();
        while (zalyshok != 0 && !zalyshokMapa.containsKey(zalyshok)) {
            zalyshokMapa.put(zalyshok, result.length());
            zalyshok *= 10;
            result.append(zalyshok / q);
            zalyshok %= q;
        }
        if (zalyshok != 0) {
            int index = zalyshokMapa.get(zalyshok);
            result.insert(index, '(');
            result.append(')');
        }

        return result.toString();
    }
}