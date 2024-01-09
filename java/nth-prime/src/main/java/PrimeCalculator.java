import java.util.ArrayList;

class PrimeCalculator {
    int nth(int n) {
        if(n < 1)    throw new IllegalArgumentException();

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);

        for(int i=5; primes.size()<n; i++) {
            boolean isPrime = true;
            for (int j=2; j<=Math.sqrt(i); j++) {
                if (i % j == 0) isPrime = false;
            }
            if (isPrime) primes.add(i);
        }

        return primes.get(n-1);
    }

}