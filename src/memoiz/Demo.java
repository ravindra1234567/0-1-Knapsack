package memoiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Demo {
	
	 public static int intersection(int[] nums) {
	        
		 int n = nums.length;
		 	if(n==0)
		 		return 0;

	        TreeSet<Integer> t = new TreeSet<>();

	        for(int i  : nums)
	            t.add(i);
	        
	        if(t.size()<=2){
	            return t.last();
	        }

	        t.remove(t.last());
	        t.remove(t.last());
	        System.out.println(t);

	        return t.last();
	        
	    }
	 
	public static void main(String[] args) {
		int[] nums = {1,2};
		
		
		int aa =  intersection(nums);
		System.out.print(aa);
	}

}






















