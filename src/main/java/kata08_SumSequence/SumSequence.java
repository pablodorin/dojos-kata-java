package kata08_SumSequence;

public class SumSequence {
    public static int sequenceSum(int begin, int end, int step) {
        int result = 0;

        if (begin <= end) {
            for (int i = begin; i <= end; i += step) {
                result += i;
            }
        }

        return result;
    }
}
