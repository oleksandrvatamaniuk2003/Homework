public class PorivnianiaArgumentiv {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("vvesty 3 tsilikh arhumenty komandnoho riadka (a, b, c)");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int kilkistRiznikhZnachen = pidrahnitiRizniZnachennia(a, b, c);
        System.out.println("Kilkist' riznikh znachen' sered a, b i c: " + kilkistRiznikhZnachen);
    }

    public static int pidrahnitiRizniZnachennia(int a, int b, int c) {
        java.util.Set<Integer> mnogynaRiznikhZnachen = new java.util.HashSet<>();
        mnogynaRiznikhZnachen.add(a);
        mnogynaRiznikhZnachen.add(b);
        mnogynaRiznikhZnachen.add(c);

        return mnogynaRiznikhZnachen.size();
    }
}
