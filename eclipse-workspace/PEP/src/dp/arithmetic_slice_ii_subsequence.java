package dp;

import java.util.*;

public class arithmetic_slice_ii_subsequence {

	 public static void main(String[] args) {
 	 	 Scanner scn= new Scanner(System.in);
 	 	 int n=scn.nextInt();
 	 	 int[] A = new int[n];
         for(int i=0;i<n;i++)
             A[i]=scn.nextInt();
 	 	 System.out.print(Arithmetic_Subsequence(A));
 	 }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an integer array
 	 // It should return the required output
 
 	 public static int Arithmetic_Subsequence(int[] A) {
 	 	 //Write your code here
 		 int count=0;
 		 int n = A.length;
 		 HashMap<Integer, Integer> hm[] = new HashMap[n];
 		 
 		 for(int i=0;i<n;i++)
 		 {
 			 hm[i] = new HashMap<Integer, Integer>(i);
 			 for(int j = 0;j<i;j++)
 			 {

 				 int diff = A[i]-A[j];
 				 int freq = hm[j].getOrDefault(diff, 0);
 				 count+=freq;
 				 hm[i].put(diff, freq+hm[i].getOrDefault(diff, 0)+1);
 				 
 			 }
 		 }
 		 
 		 return count;
 		 
 		 
 	 }

}
