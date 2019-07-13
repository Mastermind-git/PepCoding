package dp;

import java.util.*;

public class russian_doll_envelopes {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
	 	 int envelopes[][]=new int[r][2];
	 	 for(int i=0;i<r;i++){
            for(int j=0;j<2;j++){
                envelopes[i][j]=scn.nextInt();
            }
	 	 }
	 	 System.out.println(maxEnvelopes(envelopes));
    }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as an integer array
	 // It should return the required output

	 public static int maxEnvelopes(int[][] envelopes) {
	 	 //Write your code here
		 Arrays.sort(envelopes,(a,b)->Integer.compare(a[0], b[0]));
		 int width[] = new int[envelopes.length];
		 for (int i = 0; i < envelopes.length; i++) {
			//System.out.println(envelopes[i][0]+" "+envelopes[i][1]);
			width[i] = envelopes[i][1];
		}
		 int max=1;
		    int[] arr = new int[envelopes.length];
		    for(int i=0; i<envelopes.length; i++){
		        arr[i]=1;
		        for(int j=i-1; j>=0; j--){
		            if(envelopes[i][0]>envelopes[j][0]&&envelopes[i][1]>envelopes[j][1]){
		                arr[i]=Math.max(arr[i], arr[j]+1);
		            }
		        }
		        max = Math.max(max, arr[i]);
		    }
		 
		    return max;
	 }
	 
	 
	 
}
