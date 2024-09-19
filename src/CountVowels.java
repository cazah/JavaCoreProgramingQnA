import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Arunkumar J ";

        List<Character> characters = Arrays.asList('a','e','i','o','u');
        str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(characters::contains)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
