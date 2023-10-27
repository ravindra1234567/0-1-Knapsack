package topdown;

public class CountSubsetSum {
	
	public static int countSubsetSum(int[] arr, int sum) {
		
		int n = arr.length;
		
		if(n == 0)
			return 0;
		if(sum == 0)
			return 1;
		
		int[][] dp = new int[n+1][sum+1];
		
		for(int i=0;i<n+1;i++)
			dp[i][0] = 1;
		
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(arr[i-1] <= j)
					dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		return dp[n][sum];
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3};
		int sum = 6;
		
		System.out.println(countSubsetSum(arr, sum));
		
	}

}
