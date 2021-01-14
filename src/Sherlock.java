import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;



public class Sherlock {
	// Complete the solve function below.
    static int solve(int n, int m) {
    	return Integer.valueOf(combination((n+m-1), m-1).mod(BigInteger.valueOf(1000000007)).toString());
    }
    
    private static BigInteger combination(int a, int b) {
    	if (b == 0 || a == b) {
    		return BigInteger.ONE;
    	}
    	return factorial(a).divide((factorial(b).multiply(factorial(a-b))));
    }
    
    private static BigInteger factorial(int a) {
    	BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= a; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
    
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int vals [][] = new int [2][a];
    	for(int i = 0; i < a; i ++) {
    		vals[0][i] = sc.nextInt();
    		vals[1][i] = sc.nextInt();
    		System.out.println(i + " " + solve(vals[0][i], vals[1][i]));
    	}
    	System.out.println("done");
    }
}
