package ArraysString;

import java.util.*;

public class long_pressed_name {

	 public static void main(String[] args) {
		 
 	 	 Scanner scn = new Scanner(System.in);
 	 	 String name = scn.next();
 	 	 String typed = scn.next();
 	 	 System.out.println(isLongPressedName(name, typed));
 
 	 }
 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input 2 strings
 	 // It should return boolean output.
 	 public static boolean isLongPressedName(String name, String typed) {
 	 	 // Write your code here
 		 for(int i=0,j=0;i<name.length()&&j<typed.length();)
 		 {
 			 while(i<name.length()&&j<typed.length()&&name.charAt(i)==typed.charAt(j))
 			 {
 				System.out.println(name.charAt(i)+"????");
 				 i++;j++;
 				 
 			 }
 			 while(j<typed.length()&&typed.charAt(j-1)==typed.charAt(j))
 			 {
 				j++;
 				// System.out.println(typed.charAt(j)+"''''");
 				 
 			 }
 			 //System.out.println(name.charAt(i)+" "+typed.charAt(j));

 			 if(i<name.length()&&j<typed.length()&&name.charAt(i)!=typed.charAt(j))
 				 return false;
 			 
 		 }
 		 
 		 return true;
 	 }
}
