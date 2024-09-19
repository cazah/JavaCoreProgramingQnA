import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfIntList {

    public static void main(String[] args) {
        System.out.println("Get SUM of given Integer List");
        System.out.println("11,33,23,57,999,45");

        List<Integer> numList = Arrays.asList(11,33,23,57,999,45);
        int sum = numList.stream().mapToInt(n -> n).sum();

        System.out.println("SUM : " + sum);
    }
}
