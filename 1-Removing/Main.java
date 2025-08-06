
import java.util.Arrays;
import java.util.List;

public class main {
     public static void main(String[] args) {
        List<String> original = Arrays.asList("Keep", "Remove", "Keep", "Remove", "Keep");
        List<String> resultado = Remove.removeEveryOther(original);
        System.out.println(resultado); // Debería imprimir: [Keep, Keep, Keep]
    }
    
}
