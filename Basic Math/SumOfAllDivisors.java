public class SumOfAllDivisors {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int totalSum = 0;
	    for(int i = 1; i <= n; i++) {
		    int partialSum = 0;
		    for(int j = 1; j * j <= i; j++) {
			    if(i % j == 0) {
				    partialSum += j;
				    if(i / j != j) {
					    partialSum += i / j;
				    }
			    } 
		    }
		    totalSum += partialSum;
	    }
	    return totalSum;
    }
}
