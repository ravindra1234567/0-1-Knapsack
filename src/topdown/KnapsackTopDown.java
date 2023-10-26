package topdown;

import java.util.Arrays;

public class KnapsackTopDown {
	
	public static int knapsack(int[] val, int[] wt, int w, int n) {
		
		if(n ==0 || w == 0)
			return 0;
		
		int[][] dp = new int[n+1][w+1];
		
		for(int i=1;i<n+1;i++) {
			
			for(int j=1;j<w+1;j++) {
				
				if(wt[i-1] <= j) {
					dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(Arrays.deepToString(dp));
		
		return dp[n][w];
	}
	
	public static void main(String[] args) {
		
		int[] wt = {4,5,6};
		int[] val = {1,2,3};
		int w=3;
		int n = wt.length;

		
		System.out.println( knapsack(val,wt,w,n) );
	}

}
