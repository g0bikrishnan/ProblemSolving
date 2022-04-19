import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        String[] s1={"this","is","array1"};
        String[] s2={"this","is","array12"};
        String[] s3 =Stream.concat(Arrays.stream(s1),Arrays.stream(s2)).toArray(String[]::new);
        Arrays.stream(s3).forEach(System.out::println);
    }
}
