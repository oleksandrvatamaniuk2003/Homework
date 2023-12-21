public class VvedennyaImeni {
    public static void main(String[] args) {
        if (args.length >= 1) {
            // Vvidenе іmya korystuvacha
            String imyaKorystuvacha = args[0];

            // Vivodimo imya korystuvacha
            System.out.println("Vvedene im'ya korystuvacha: " + imyaKorystuvacha);
        } else {
            System.out.println("Nedostatn'o argymentiv. Potribno vvesty im'ya korystuvacha.");
        }
    }
}

// java VvedennyaImeni Oleg - pryklad komandy