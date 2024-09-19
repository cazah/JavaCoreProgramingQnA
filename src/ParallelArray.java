import java.util.Arrays;

public class ParallelArray {
    public static void main(String[] args) {
        int[] arr = {90,30,70,78,20,2};

        // Parallel sort Ascending order
        Arrays.parallelSort(arr);


        // sorting data in specified range in ascending order
        Arrays.parallelSort(arr,1,6);
        for(int a : arr){
            System.out.print(a + ",");
        }
    }
}
