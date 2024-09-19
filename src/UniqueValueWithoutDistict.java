import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueValueWithoutDistict {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,56,7,8,9,1,3,4,5,55);
        Set<Integer> collect = new HashSet<>(list);
        collect.stream().forEach(System.out::println);
        //Set<Integer> collect = list.stream().collect(Collectors.toSet());

    }
}
