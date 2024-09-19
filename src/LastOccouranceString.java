import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastOccouranceString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("arun","inno","norah","billa","farah","abdul");
        // Last Occourance and start with
      List<String> nList = list.stream()
                .filter(str -> str.startsWith("a"))
                        .toList();
       String result = nList.get(nList.size()-1);
       System.out.println(result);
    }
}
