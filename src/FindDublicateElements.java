import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDublicateElements {
    public static void main(String[] args) {
       String name = "Arunkumarj";

        Set<Character> list = new HashSet<>();
        // Find Dublicate
        Set<Character> mlist = name.toLowerCase().chars()
               .mapToObj(c -> (char) c)
               .filter(s -> !list.add(s))
               .collect(Collectors.toSet());

        for (Character c : mlist){
            System.out.println(c);
        }




        //System.out.println("DUP Count " + dubCount);
    }
}
