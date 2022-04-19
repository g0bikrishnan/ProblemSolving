import java.util.*;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args) {
        int [] a={100,12,34,66,97,95};
        int[] b={10,20,60,20,40,50,20,40,50,40};
//     findSecondLarge(a);
     removeDuplicates(b);
    }

    private static void removeDuplicates(int[] b) {
        System.out.println("Before Removing Duplicates");
        Arrays.stream(b).forEach(System.out::println);
        List<Integer> list=Arrays.asList(b);
        System.out.println("After Removing Duplicates");
        List<int[]> list1 = list.stream().distinct().collect(Collectors.toList());
        list1.forEach(x-> Arrays.stream(x).forEach(System.out::println));

    }

    private static void findSecondLarge(int[] a) {
        Arrays.sort(a);
        System.out.println(a[a.length-2]);

    }
}
