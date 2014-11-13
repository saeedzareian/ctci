package ch1.ds;

import java.util.Scanner;

public class Q1_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] str = s.nextLine().toCharArray();
		reverse(str);
		System.out.println(str);
	}
	public static void reverse(char[]  str){
		int i=0;
		//while(str[i] != '\0'){ i++; } //not working in JAVA
		int length = str.length-1;
		char temp; 
		i=0;
		while(i <= length/2){
			temp = str[i];
			str[i] = str[length-i] ;
			str[length-i] = temp;
			i++;
		}
		
	}
}	
