package memoiz;

import java.util.Arrays;

public class Demo {
	
	 public static int kthGrammar(int n, int k) {

			String[] arr = new String[n];
			String temp="";
			String p="";
			arr[0] = "0";
			
			for(int i=0;i<n-1;i++) {
				temp = arr[i];
				for(int j=0; j < temp.length(); j++) {
					if(temp.charAt(j) == '0') 
						p = p+"01";
					if(temp.charAt(j) == '1') 
						p = p+"10";		
				}
				arr[i+1] = p;
				p="";
			}

			System.out.println(arr[n-1].charAt(k-1));
			
			int a = arr[n-1].charAt(k-1);
			
			System.out.println(arr[n-1].charAt(k-1));
			
			if(a == 48)
				return 0;

	       return 1;
	    }

	public static void main(String[] args) {

		int n=2;
		String[] arr = new String[n];
		String temp="";
		String p="";
		arr[0] = "0";
		
		for(int i=0;i<n-1;i++) {
			temp = arr[i];
			for(int j=0; j < temp.length(); j++) {
				if(temp.charAt(j) == '0') 
					p = p+"01";
				if(temp.charAt(j) == '1') 
					p = p+"10";
				
			}
			arr[i+1] = p;
			p="";
		}
		
		//System.out.println(Arrays.toString(arr));
		
		//System.out.println(arr[n-1].charAt(k-1));
		
		System.out.println(kthGrammar(30,434991989));
	}

}
