public class FactorialLong
  {

    static long fact(long n) {
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        long n = 20;

        long value = fact(n);

        System.out.println(value);
    }
}