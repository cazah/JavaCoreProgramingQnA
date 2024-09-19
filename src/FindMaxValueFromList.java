import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxValueFromList {
    public static void main(String[] args) {
        List<Integer> nList = Arrays.asList(1,3,4,7,8,10,119,22,-2);

        int max = nList.stream()
                .mapToInt(num -> num)
                        .max().orElseThrow();

        System.out.println("MAX : " + max);
    }
}
