import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"London");
        map.put(2,"Australia");
        map.put(3, "USA");

        map.remove(3); // remove by Key
        map.get(2);
    }
}
