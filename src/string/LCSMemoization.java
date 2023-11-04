package string;

import java.util.*;

public class LCSMemoization {
	
	public static int[][] arr = new int[20][20];
	
	public static int lcs(String s1, String s2, int n, int m) {
		
		if(n==0 || m == 0)
			return 0;
		
		if(arr[n][m] != -1)
			return arr[n][m];
		
		if(s1.charAt(n-1) == s2.charAt(m-1))
			return arr[n][m] = 1 + lcs(s1,s2,n-1,m-1);
		else
			return arr[n][m] = Math.max(lcs(s1,s2,n-1,m), lcs(s1,s2,n,m-1));
	}

	public static void main(String[] args) {
		
		String s1 = "nabcdfhn";
		String s2 = "abcdhrtnnn";
		
		int n = s1.length();
		int m = s2.length();
		
		Arrays.stream(arr).forEach(row -> Arrays.fill(row,-1));
		
		//System.out.println(Arrays.deepToString(arr));
		
		System.out.println(lcs(s1,s2,n,m));

	}

}
