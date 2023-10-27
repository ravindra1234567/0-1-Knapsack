package topdown;

import java.util.Arrays;

public class SubsetSum {

	
	public static boolean subsetSum(int[] arr, int sum) {
		
		int n = arr.length;
		
		if(n==0)
			return false;
		if(sum == 0)
			return true;
		
		boolean[][] dp = new boolean[n+1][sum+1];
		
		for(int i=0;i<=n;i++)
			dp[i][0] = true;
		for(int j=1;j<=sum;j++)
			dp[0][j] = false;
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(arr[i-1] <= j)
					dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		System.out.println(Arrays.deepToString(dp));
		return dp[n][sum];
	}
	public static void main(String[] args) {
		int[] arr = {3,34,4,12,5,2};
		int sum = 9;
		System.out.println( subsetSum(arr,sum) );

	}

}
