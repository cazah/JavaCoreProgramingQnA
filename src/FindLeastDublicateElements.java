import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLeastDublicateElements {

    public static void main(String[] args) {
        String name = "arunkumarja";

        // Find Dublicate
        Optional<Map.Entry<Character, Long>> group = name.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().max((a,b) -> a.getValue().compareTo(b.getValue()));

        group.ifPresent(System.out::println);
    }
}
