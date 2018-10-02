import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Chun Zheng");
        people.add("Cameron Woods");
        people.add("James Corsi");
        people.stream().sorted((p1, p2) -> p1.compareTo(p2)).forEach(System.out::println);
    }
}
