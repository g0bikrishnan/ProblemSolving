import org.jetbrains.annotations.Contract;

import java.util.*;

public class StringReverse {
    private static char[] list2;
    private static String rev="";

    public static void main(String[] args) {
        String s1="Gobikrishnan";
        //Method one
        StringBuilder b1= new StringBuilder(s1);
        System.out.println("method 1 :  "+b1.reverse());
        //method two
        for (int i = s1.length()-1; i >=0 ; i--)
        {
            rev +=s1.charAt(i);
        }
        System.out.println("method 2 :  "+rev);
        //method three
        List<Character> list= new ArrayList<>();
        for (char s:s1.toCharArray())
        {
            list.add(s);
        }
        Collections.reverse(list);
        System.out.print("method 3 :  ");
        list.stream().forEach(x->System.out.print(x));


        //Method four
        //using unicode RLO
        System.out.println("\nmethod 4 :  " +"\u202E"  + s1);
        //Method 5
        //using stack
        char[] ch=s1.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (char s:s1.toCharArray())
        {
            stack.push(s);

        }
        int k=0;
        while (!stack.isEmpty())
        {
            ch[k++]=stack.pop();

        }
        System.out.println("method 3 :  "+String.copyValueOf(ch));

    }


}
