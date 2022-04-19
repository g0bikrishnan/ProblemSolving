@java.lang.FunctionalInterface
interface MyInterface
{
    int method(int x);

}

public class FunctionalInterface {
    public static void main(String[] args) {
        MyInterface m=(x)->{
            return (int) Math.pow(2,x);
        };
        System.out.println(m.method(10));
    }

}
