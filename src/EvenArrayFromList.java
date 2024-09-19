import java.util.Arrays;
import java.util.List;

public class EvenArrayFromList {
    public static void main(String[] args) {
        System.out.println("PRINT EVEN ARRAY FROM GIVEN LIST : ");
        List<Integer> nList = Arrays.asList(1,3,4,7,8,10,119);

        List<Integer> eList = nList.stream()
                .filter(n-> n%2 ==0)
                .toList();

        List<Integer> oList = nList.stream()
                .filter(n-> n%2 !=0)
                .toList();

        for (int i : eList){
            System.out.print(" " + i);
        }
    }
}
