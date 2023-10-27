package topdown;
import java.util.*;

public class EqualSumPartition {
	
	public static boolean subsetSum(int[] arr, int sum) {
		
		int n = arr.length;
	
		if(n==0)
			return false;
		if(sum == 0)
			return true;
		
		boolean[][] dp = new boolean[n+1][sum+1];
		
		for(int i=0;i<n+1;i++)
			dp[i][0] = true;
		
		for(int j=1;j<sum+1;j++)
			dp[0][j] = false;
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				
				if(arr[i-1] <= j)
					dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		return dp[n][sum];
	}
	
	public static boolean equalSumPartition(int[] arr) {
		
		int total = Arrays.stream(arr).sum();
		
		if(total %2 == 0) {
			int sum = total/2;
			return subsetSum(arr,sum);
		}else
			return false;
	}

	public static void main(String[] args) {
		int[] arr = {1, 5, 11, 5};
		
		System.out.println(equalSumPartition(arr));
		
	}

}
