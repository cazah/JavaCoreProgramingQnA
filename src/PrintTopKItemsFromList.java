import java.util.Arrays;
import java.util.List;

public class PrintTopKItemsFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,44,55,66,77,33,22,221);
        list.stream().limit(5).forEach(System.out::println);
    }
}
