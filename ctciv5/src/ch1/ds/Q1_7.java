package ch1.ds;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_7 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m=3;
		int n=4;
		int[][] matrix = new int[m][n];
		//I could set the values to other values than 0 and at the end change them to 0 to avoid conflict,
		//but I decided to keep the rows and columns that are going to be 0ed.
		ArrayList<Integer> rows = new ArrayList<Integer>();
		ArrayList<Integer> cols = new ArrayList<Integer>();
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix[i][j]= in.nextInt();
				if(matrix[i][j] == 0){
					rows.add(i);
					cols.add(j);
				}
			}
		}
		//first 0ing rows then cols
		for(int i=0; i<rows.size(); i++){
			for(int j =0; j<n; j++){
				matrix[rows.get(i)][j]= 0;
			}
		}
		for(int i=0; i<cols.size(); i++){
			for(int j =0; j<m; j++){
				matrix[j][cols.get(i)]= 0;
			}
		}
		//output
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
