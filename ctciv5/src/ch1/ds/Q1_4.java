package ch1.ds;

import java.util.Scanner;

public class Q1_4 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		char[] str = s.nextLine().toCharArray();
		
		int length= str.length-1;
		char[] str2 = new char[length*2];
		for(int i=0; i<str.length;i++){
			str2[i]= str[i];
		}
		 int i = str.length-1;

		while(i>0){
			if(str2[i]== ' '){
				int j = length;
				while(j!=i){
					str2[j+2] = str2[j];
					j--;
				}
				str2[i] = '%';
				str2[i+1] = '2';
				str2[i+2] = '0';
				length +=2;
			}
			i--;
		}
		System.out.println(str2);
	}
}
