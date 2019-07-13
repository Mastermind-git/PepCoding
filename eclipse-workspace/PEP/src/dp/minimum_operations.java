package dp;

import java.util.Scanner;

public class minimum_operations {

	 public static void main(String[] args) {
 	 	 // TODO Auto-generated method stub
 	 	 Scanner s = new Scanner(System.in);
             int n = s.nextInt();
             minOperations(n);
     }
     	 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an integer
 	 // It should print the required output
 
     static void minOperations(int n){
 	 	 // Write your code here
    	 
    	 
 		 int steps[] = new int[n+1];
 		 
 		 for(int i=1;i<=n;i++)
 		 {
 			
 			 if(i%2==0)
 			 { steps[i] = steps[i/2]+1;}
 			 else
 				 steps[i] = steps[i-1]+1;
 			 //System.out.println(i+" "+steps[i]);
 		 }
 		 
 		 
 		 System.out.println(steps[n]);
 	 }
}
