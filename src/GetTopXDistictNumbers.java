import java.util.Arrays;
import java.util.List;

public class GetTopXDistictNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,33,44,11,44,22,11,66,77,88,11);

        List<Integer> integerList =  list.stream()
                .distinct()
                .limit(3)
                .toList();

        for (Integer n : integerList){
            System.out.println(n);
        }
    }
}
