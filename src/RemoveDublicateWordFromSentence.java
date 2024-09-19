import java.util.*;

public class RemoveDublicateWordFromSentence {
    public static void main(String[] args) {
        String str = "I am a Software Engineer and I works here";

        Arrays.stream(str.split(" "))
                .distinct().forEach(word -> System.out.print(word +" "));
    }
}
