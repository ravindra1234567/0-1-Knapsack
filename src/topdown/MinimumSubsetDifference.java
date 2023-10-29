package topdown;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSubsetDifference {
	
	public static boolean[][] subsetSum(int[] arr, int range){
		
		int n = arr.length;
		
		boolean[][] dp = new boolean[n+1][range+1];
		
		for(int i=0;i<n+1;i++)
			dp[i][0] = true;
		
		for(int j=1;j<range;j++)
			dp[0][j] = false;
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<range+1;j++) {
				if(arr[i-1] <= j)
					dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		return dp;
	}
	
	 public static int miinimumSubsetDifference(int[] arr){
		 int range = Arrays.stream(arr).sum();
		 boolean[][] aa =  subsetSum(arr,range);
		 //System.out.println(Arrays.deepToString(aa));
		 
		 for(int i=0;i<aa.length;i++) {
			 for(int j=0;j<aa[0].length;j++)
				 System.out.print(aa[i][j] + " ");
			 System.out.println();	 
		 }
		 int min = Integer.MAX_VALUE;
		 
		 ArrayList<Integer> list = new ArrayList();
		 
		 for(int i=range/2; i>=0; i--) {
			 if(aa[arr.length-1][i] == true ) {
				 min = Math.min(min, range - (i*2));
			 }
		 }
			
		 return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {36,-36};
		
		 System.out.println("Result = " + miinimumSubsetDifference(arr));

	}

}
