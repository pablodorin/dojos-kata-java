import java.util.ArrayList;
import java.util.List;

public class Remove {

    public static List<String> removeEveryOther(List<String> input) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i += 2) {
            result.add(input.get(i));
        }

        return result;
    }
}