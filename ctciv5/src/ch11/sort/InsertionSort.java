package ch11.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		while(in.hasNextInt()){
			input.add(in.nextInt());
		}
		input =InsertionSorter.sort(input);
		InsertionSorter.print(input);
	}
	
	public static class InsertionSorter{
		public static ArrayList<Integer> sort(ArrayList<Integer> in){
				for(int i=2; i<in.size(); i++){
					for(int j=i; j>1 && in.get(j) < in.get(j-1); j--){
							int temp = in.get(j);
							in.set(j, in.get(j-1)) ;
							in.set(j-1, temp);
							System.out.println("Swapped");
						
					}
				}
			
			return in;
		}
		public static void print(ArrayList<Integer> in){
			Iterator<Integer> it = in.iterator();
			while(it.hasNext()) System.out.print(it.next()+ " ");
			System.out.println();
		}
	}
}
