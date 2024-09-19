import java.util.Collections;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfDublicate {
    public static void main(String[] args) {
        String name = "arunkumar";
        name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() > 1)
                .forEach(System.out::println);
    }
}
