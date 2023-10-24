package recursive;

public class KnapsackRecursive01 {

	public static int knapsackRecursive(int[] wt, int[] val, int w, int n){
		
		if(w == 0 || n == 0)
			return 0;
		
		if(wt[n-1] <= w) {
			return Math.max(val[n-1]+knapsackRecursive(wt,val,w-wt[n-1],n-1), knapsackRecursive(wt,val,w,n-1));
		}else
			return knapsackRecursive(wt,val,w,n-1);
	}
	public static void main(String[] args) {
		
		int[] wt = {4,5,6};
		int[] val = {1,2,3};
		int w=3;
		int n = wt.length;
		
		System.out.println( knapsackRecursive(wt,val,w,n));
	}
}
