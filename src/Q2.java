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

public class Q2 {
	public static List<Integer> oddNumbers(int l, int r) {
	    List<Integer> out = new ArrayList<Integer>();
	    for (int i = l; i <= r; i ++) {
	    	if (i%2 == 1) {
	    		out.add(i);
	    	}
	    }
	    return out;
	}
}
