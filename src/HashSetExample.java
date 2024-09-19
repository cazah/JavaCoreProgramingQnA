import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);
        nums.add(40);

        int length = nums.size();
        boolean isEmpty = nums.isEmpty();
        boolean is10Contains = nums.contains(10);

        for (Integer n : nums){
            System.out.print(n + ",");
        }
    }
}
