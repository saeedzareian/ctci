package ch1.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/***
 * 
 * @author saeed
 *	returns no when there is duplicates, yes in duplicates
 */
public class Q1_1 {

	public static void main(String[] args) {
		
 	 // part1();
 	  part2();

	}
	public static void part1(){
	       Scanner s= new Scanner(System.in);	
	       String str=  s.nextLine();
	       ArrayList<Character> list = new ArrayList<Character>();
	       for(int i=0; i<str.toCharArray().length; i++){
	    	   if(list.contains(str.charAt(i))){
	    		  System.out.println("No");
	    		  return;
	    	   }
	    	   list.add(str.charAt(i));
	       }
	 	  System.out.println("Yes");
	}
	public static void part2(){
	       Scanner s= new Scanner(System.in);	
	       String str=  s.nextLine();
	       char[] string = str.toCharArray();
	       Arrays.sort(string);
	       char last = string[0];
	       for(int i=1; i<string.length;i++){
	    	   if(last==string[i]){
	    		   System.out.println("NO");
	    		   return ; 
	    	   }
	    	   last = string[i];
	       }
	 	  System.out.println("Yes");
	}
}
