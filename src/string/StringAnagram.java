package string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		
		String s1 = "abc";
		String s2 = "bca";
		
		int[] arr = new int[256];
		int[] arr1 = new int[256];
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		boolean isAnagram = false;
		
		if(n1 == n2) {
			for(int i=0;i<n1;i++) {
				int i1 = (int)s1.charAt(i);
				int i2 = (int)s2.charAt(i);
				//System.out.println(i2);
				
				if(arr[i1] > 0)
					arr[i1] = arr[i1]+1;
				else
					arr[i1] = 1;
				
				if(arr1[i2] > 0)
					arr1[i2] = arr1[i2]+1;
				else
					arr1[i2] = 1;
				
				//System.out.println("i2 " + arr1[i2]); 
			}
			int count =0;
			for(int i=0;i<256;i++) {
				if(arr[i] > 0 && arr1[i] > 0 && arr[i] == arr1[i]) {
					count++;
				}
			}
			
			System.out.println("count = "+ count);
			if(count == n1)
				System.out.println("anagram");
			else
				System.out.println(" not anagram");
		}

	}

}
