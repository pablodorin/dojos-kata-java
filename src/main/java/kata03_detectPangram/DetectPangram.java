package kata03_detectPangram;

public class DetectPangram {
    public static boolean isPangram(String input) {
        String lower = input.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (!lower.contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }
}
