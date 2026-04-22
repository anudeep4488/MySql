class Solution {
    	 public static int maxScore(String s) {

	        int countOfZeors = 0;
	        int max = 0;
	        
	        for(int i =0 ; i < s.length()-1 ; i++){
	            if(s.charAt(i)=='0') {
	            	countOfZeors++;
	            }

	            int countOfOnes = 0;
	            int sum=0;
	            for(int j=i+1;j<s.length();j++){
	                if(s.charAt(j)=='1') {
	                	countOfOnes++;
	                }
	            }
	            sum = countOfZeors + countOfOnes;
	            max = Math.max(sum,max);

	        }
	        return max;
	        
	    }

  
}