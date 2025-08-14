package kata09_CountTheDigit;

public class CountTheDigit {

    public static int nbDig(int n, int d) {
        String ds = String.valueOf(d);
        int total = 0;

        for (int k = 0; k <= n; k++) {
            String sq = String.valueOf(k * k);
            for (int i = 0; i < sq.length(); i++) {
                if (String.valueOf(sq.charAt(i)).equals(ds)) {
                    total++;
                }
            }
        }

        return total;
    }
}
