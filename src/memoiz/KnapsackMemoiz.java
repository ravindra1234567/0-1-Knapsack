package memoiz;

import java.util.Arrays;

public class KnapsackMemoiz {

	static int[][] t = new int[10][10];
	
	public static int KnapsackMemoiz(int[] wt, int[] val, int w, int n) {
		
		if(w == 0 || n == 0)
			return 0;
		
		if(t[w][n] != -1)
			return t[n][w];
		
		if(wt[n-1] <= w) {
			return t[n][w] = Math.max(val[n-1]+KnapsackMemoiz(wt,val,w-wt[n-1],n-1),KnapsackMemoiz(wt,val,w,n-1));
		}else {
			return t[n][w] = KnapsackMemoiz(wt,val,w,n-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		Arrays.stream(t).forEach(row -> Arrays.fill(row, -1));
		
		int[] wt = {4,5,6};
		int[] val = {1,2,3};
		int w=4;
		int n = wt.length;
		
		System.out.println(KnapsackMemoiz(wt,val,w,n));
		
		System.out.println(Arrays.deepToString(t));
		
		
	}
}
