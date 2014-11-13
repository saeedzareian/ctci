package ch1.ds;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] str1= s.nextLine().toCharArray();
		char[] str2= s.nextLine().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		//if(str1.equals(str2)== true){ // Not working
		//if(str1.toString().equals(str2.toString())){ //Not working
		/*	System.out.println("Yes");
		}else{
			System.out.println("No");
		}*/
		for(int i=0; i<str1.length; i++){ // Manual Comparison:D
			if(str1[i] != str2[i]){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");	
	}

}
