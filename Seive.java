import java.util.ArrayList;

class Seive {

    public int countPrimes(int n) {

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 2; i < n; i++) {

            boolean isPrime = true;

            for(int j = 2; j * j <= i; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                primes.add(i);
            }
        }

        return primes.size();
    }

    public static void main(String[] args) {

        Seive s = new Seive();

        System.out.println(s.countPrimes(10));
    }
}