import java.text.Collator;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharsFromString {
    public static void main(String[] args) {
        System.out.println("Get the count each chars available in the Given String Using Streams");
        String str = "Arun Kumar J";
        System.out.println("Provided String : " + str);

        str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v) -> System.out.print(k + " : "+ v + " "));


        System.out.println("PRINT DESC By Keys : ");

        str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a,b) -> b.getKey().compareTo(a.getKey()))
                .forEach(p -> System.out.print(p.getKey() +" : " + p.getValue() + " "));

    }
}
