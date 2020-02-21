package com.codility.practice.five;

public class MinAvgTwoSlice {
	
	   public int solution(int[] A) {
		    
		    int startIndex = 0;
		    double minAve = Double.MAX_VALUE;
		    
		    int i  = 0;
		    
		    if ( A.length < 3)
		    {
		    	return 0;
		    }
		    
	        for ( ; i < A.length - 2; i++)
	        {
	        	 
	        
	        	 
        	   double av2 = (double)(A[i] + A[i + 1]) /  2;
        	   double av3 = (double)(A[i] + A[i + 1] + A[i + 2]) /  3;
        	   double currentMinAve = Math.min(av2, av3);
        	   if (currentMinAve < minAve)
        	   {
        		   startIndex = i;
        		   minAve = currentMinAve;
        	   }
        	   
        	         	   
	        	 
	        }
	        double lastAve = (double)(A[A.length - 1] + A[A.length - 2			])/2 ;
	        if ( lastAve < minAve)
	        {
	        	startIndex = A.length - 2;
	        }
	        return startIndex;
	    }

	   public static void main(String arg[])
	   {
		   System.out.print(new MinAvgTwoSlice().solution(new int[] {
				    4,  2, 2,  5,  1, 5, -100, -120, -122
		   }));
	   }
}
