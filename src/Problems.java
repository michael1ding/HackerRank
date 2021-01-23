import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Problems {
	public static long getWays(int n, List<Long> c) {
	    long [] solutions = new long[n];
	    calculateWays(solutions);
	    return solutions[n-1];
	}
	
	public static void calculateWays(long [] solutions) {
		
	}

}
