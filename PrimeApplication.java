package calculators;

/**
 * Simple calculator application class.
 * @author Felipe L.
 */
public class PrimeApplication {

	/**
	 * The prime numbers up to 100.
	 */
	static private final long[] PRIMES = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

	/**
	 * Tests if the given value is prime. Note the this algorithm depends on
	 * variable PRIMES to be in natural order. Also note that the effort class
	 * required is log(N).
	 * @param value the value
	 * @return whether or not the given value is prime
	 */
	static private boolean isPrime (final long value) {
//		for (final long prime : PRIMES)
//			if (prime == value) return true;
//		return false;

		for (int index = PRIMES.length / 2, offset = PRIMES.length - index; ; index += offset) {
			final long prime = PRIMES[index];
			if (prime == value) return true;

			offset = (offset & 1) == 0 ? Math.abs(offset) / 2 : Math.abs(offset) / 2 + 1;
			if (offset == 0) return false;

			offset = prime > value ? -offset : +offset;
		}
	}


	/**
	 * Application entry point
	 * @param args the runtime arguments - the single argument is a whole number to be tested
	 */
	static public void main (final String[] args) {
		final long value = Long.parseLong(args[0]);
		final boolean prime = isPrime(value);
		System.out.println(value + " is prime? " + prime + '.');
	}
}
