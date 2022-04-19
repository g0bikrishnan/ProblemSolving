import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
       IntStream.rangeClosed(1,1000).filter(PrimeNumber::isPrime).forEach(x->System.out.print(" "+x));
    }
    static boolean isPrime(int x) {
        return x > 1 && IntStream.rangeClosed(2, x / 2).noneMatch(i -> x % i == 0);
    }
}

