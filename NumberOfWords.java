import java.util.Arrays;

public class NumberOfWords {
    public static void main(String[] args) {
        String s= "this is the string vale";
        String[] s1=s.split(" ");
        System.out.println(Arrays.stream(s1).count());
        int count = 0;
        for (char c : s.toCharArray()) {
            if(c!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
