package topdown;

import java.util.Arrays;

public class SubsetSumCountGivenDiff {

	public static int subsetCount(int[] arr, int sum){
		
		int n = arr.length;
		
		int[][] dp = new int[n+1][sum+1];
		
		for(int i=0;i<n+1;i++)
			dp[i][0] = 1;
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(arr[i-1] <= j)
					dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		return dp[n][sum];
	}
	
	public static int subsetSumDiff(int[] arr, int diff) {
		
		int sum = Arrays.stream(arr).sum();
		
		int s1 = (sum+diff)/2;
		
		return subsetCount(arr,s1);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1};
		int diff = 1;
		
		System.out.println(subsetSumDiff(arr, diff));
	}
}
