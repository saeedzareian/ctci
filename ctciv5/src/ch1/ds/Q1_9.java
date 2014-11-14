package ch1.ds;

import java.util.Scanner;

public class Q1_9 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str1= in.nextLine();
		String str2= in.nextLine();
		
		for(int i=0; i<str1.length();  i++){
			String test = str2.substring(i+1, str2.length())+str2.substring(0, i);
			if(isSubString(str1, test)){
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
		
	}
	public static Boolean isSubString(String bigger, String smaller){
		//System.out.println(new String(bigger)+"|"+new String(smaller));
		if(bigger.contains(smaller)){ //just for simplgying, otherwise 2d loop with a window
			return true;
		}
		return false;
	}
}
