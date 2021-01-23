
public class oneToHundred {
	
	private int findMissing(int [] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return (1 + 100)*100/2 - sum;
	}
}
