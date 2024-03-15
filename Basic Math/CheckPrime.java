public class CheckPrime {
	public static String isPrime(int num) {
		//Your code goes here
		int count = 0;
		for(int i = 1; i * i <= num; i++) {
			if(num % i == 0) {
				count += 1;
				if(num / i != i) {
					count += 1;
				}
			}
		}
		return count > 2 || num == 1 ? "NO" : "YES";
	}
}
