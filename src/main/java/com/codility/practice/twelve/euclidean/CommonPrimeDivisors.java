package com.codility.practice.twelve.euclidean;

public class CommonPrimeDivisors {
	
	  public int solution(int[] A, int[] B) {
		  
		  int count = 0;
	        for(int i=0;i<A.length;i++) {
	            if(hasSamePrimeDivisors(A[i], B[i])){
	                count++;    
	            } 
	        }
	        return count;
	      
	   }
	  
	  
 
	  public boolean hasSamePrimeDivisors(int a, int b) {
		    int gcdValue = gcd(a,b);
	        int gcdA;
	        int gcdB;
	        while(a!=1) {
	            gcdA = gcd(a,gcdValue);
	            if(gcdA==1)
	                break;
	            a = a/gcdA;
	        }
	        if(a!=1)  {
	            return false;
	        }
	        while(b!=1) {
	            gcdB = gcd(b,gcdValue);
	            if(gcdB==1)
	                break;
	            b = b/gcdB;
	        }
	        return b==1;        
		}
	  
	 
	   public int gcd(int a, int b) {
		   		   
		    if(a % b == 0) return b;
		    return gcd(b,a%b);
		}
	  
	  

	  
	  public static void main(String arg[]) {
		  int A[] = new int[] {15, 10, 3};
		  int B[] = new int[]{ 75, 30, 5};
		  System.out.println( new CommonPrimeDivisors().solution(A, B));
	  }
}
