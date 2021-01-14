import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.math.BigInteger;

public class SummingNSeries {
	static int summingSeries(long n) {
		BigInteger out = BigInteger.valueOf(2 * ((1+n)*n/2) - n);
		return out.mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
