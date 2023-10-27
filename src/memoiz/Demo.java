package memoiz;

import java.util.Arrays;

public class Demo {
	

	 public static int strStr(String haystack, String needle) {
	        
	        int hl = haystack.length();
	        int nl = needle.length();

	        int index=0;
	        
	        for(int i=0;i<hl;i++){
	            index =i;
	            int count =0;
	            for(int j=0;j<nl;j++){
	                if( i < hl && haystack.charAt(i) == needle.charAt(j)){
	                    i++;
	                    count++;
	                    System.out.println("count= " + count);
	                }else{
	                	System.out.println("count = "+ count +" index = "+ index);
	                    break;
	                }
	                if(count == nl)
	                    return index;
	            }
	        	i = index;
	        }
	        System.out.println("Index == "+ index );
	        return -1;
	    }

	public static void main(String[] args) {

		String haystack="mississippi";
		String needle="issip";
		
		System.out.println(" result =" +strStr(haystack,needle) );
	}

}
