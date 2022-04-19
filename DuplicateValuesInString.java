import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DuplicateValuesInString {
    public static void main(String[] args) {
        String s = " this is is the the string";
        String[] str = s.split(" ");
        //Using Java 8 Streams
        System.out.println("Using Java Streams ");
        Arrays.stream(str).distinct().forEach(System.out::println);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
    }


}
