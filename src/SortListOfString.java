import java.util.Arrays;
import java.util.List;

public class SortListOfString {

    public static void main(String[] args) {
        System.out.println("Q1 : Sort the city names in Ascending order using java 8 ");
        System.out.println("Chennai,Madurai,Pune,Coimbatore");

        System.out.println("AFTER SORT ASC");
        List<String> cities = Arrays.asList("Chennai","Madurai","Pune","Coimbatore");
        cities.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        System.out.println("AFTER SORT DESC");
        System.out.println("Q2 : Sort the city names in Descending order using java 8 ");
        cities.stream()
                .sorted((a,b) -> b.compareTo(a))
                .forEach(s -> System.out.print(s + " "));
    }
}
