package ch1.ds;

import java.util.Scanner;
// 90 degrees rotation
/**
 * 
 * @author saeed
this:  
1 2 3
4 5 6
7 8 9

to:
7 4 1
8 5 2
9 6 3


 
 */
public class Q1_6 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int [][] matrix = new int [3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				matrix[j][2-i] = s.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
