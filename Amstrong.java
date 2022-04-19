import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();
        checkAmstrong(number);
    }

    private static void checkAmstrong(int number) {
        char[] ch=String.valueOf(number).toCharArray();
        int cbrt=0;
        int total = 0;
        for (char c : ch) {
            cbrt= (int) Math.pow(((int)c)-48,ch.length);
            total+=cbrt;
        }
       if(number==total)
       {
           System.out.println(total);
           System.out.println("given Number is  an Amstrong Number");
       }
       else
       {
           System.out.println("Given Number is not an Amstrong Number");
       }

    }
}
