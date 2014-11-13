package ch1.ds;

import java.util.Scanner;
/***
 * 
 * @author saeed
 * RLE java implementation
 */
public class Q1_5 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		char[] str= s.nextLine().toCharArray();
		char last=str[0];
		int counter=0;
		for(int i=1; i<str.length; i++){
			if(last!=str[i] ){
				System.out.print(last);
				if(counter>1){
					System.out.print(counter);
				}
				last= str[i];
				counter=0;
			}
			counter++;
			if(i==str.length-1){ //special case: last letter
				System.out.print(last);
				if(counter>1){
					System.out.print(counter);
				}
			}
		}
	}
}
