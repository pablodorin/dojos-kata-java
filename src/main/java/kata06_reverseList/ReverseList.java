package kata06_reverseList;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static <T> List<T> reverse(List<T> arr) {
        List<T> result = new ArrayList<>(arr.size());
        for (int i = arr.size() - 1; i >= 0; i--) {
            result.add(arr.get(i));
        }
        return result;
    }
}
