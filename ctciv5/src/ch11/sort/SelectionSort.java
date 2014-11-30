package ch11.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		while(in.hasNextInt()){
			input.add(in.nextInt());
		}
		input =SelectionSorter.sort(input);
		SelectionSorter.print(input);
	}
	
	public static class SelectionSorter{
		public static ArrayList<Integer> sort(ArrayList<Integer> in){
				for(int i=1; i<in.size(); i++){
					int k=i;
					for(int j=i+1; j<in.size(); j++){
						if(in.get(j)>in.get(k)){
							k = j;
						}
					}
					int temp = in.get(k);
					in.set(k, in.get(i)) ;
					in.set(i, temp);
					System.out.println("Swapped "+i+","+k);
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
