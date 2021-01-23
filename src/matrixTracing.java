import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;


public class matrixTracing {
	
	static int solve(int n, int m) {
		return combination(n+m-2, Math.min(n, m)-1)%1000000007;
    }

    
    private static int combination(int a, int b) {
    	if (b == 0 || a == b) {
    		return 1;
    	}
    	return factorial(a)/(factorial(b) * (factorial(a-b)));
    }
    
    private static int factorial(int a) {
    	BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= a; i++) {
            result = result.multiply(BigInteger.valueOf(i%1000000007));
        }

        return result.intValue();
    }

    
    public static void main(String[]args) {
    	System.out.println(solve(2, 3));
    }
	
	
	
}
