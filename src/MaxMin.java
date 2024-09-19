import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,45,66,77,889,99,3,30,55,2,222,12);
        OptionalInt max = list.stream().mapToInt(n -> (int) n).max();
        OptionalInt min = list.stream().mapToInt(n -> (int) n).min();

        Optional<Integer> a = list.stream()
                .max((m1,m2) -> m1.compareTo(m2));

        a.ifPresent(System.out::println);
    }
}
