package string;

public class LCSRecursion {
	
	public static int lcs(String s1, String s2, int n, int m) {
		
		if(n == 0 || m == 0)
			return 0;
		if(s1.charAt(n-1) == s2.charAt(m-1))
			return 1+lcs(s1,s2,n-1,m-1);
		else 
			return Math.max(lcs(s1,s2,n-1,m), lcs(s1,s2,n,m-1));
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "nabcdfhn";
		String s2 = "abcdhrtnnn";
		
		int n = s1.length();
		int m = s2.length();
		
		System.out.println(lcs(s1,s2,n,m));
		
	}

}
