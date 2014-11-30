package ch11.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		while(in.hasNextInt()){
			input.add(in.nextInt());
		}
		input =BubbleSorter.sort(input);
		BubbleSorter.print(input);
	}
	
	public static class BubbleSorter{
		public static ArrayList<Integer> sort(ArrayList<Integer> in){
				for(int i=0; i<in.size(); i++){
					for(int j=in.size()-1; j>i; j--){
						if(in.get(j) < in.get(i)){
							int temp = in.get(i);
							in.set(i, in.get(j)) ;
							in.set(j, temp);
							//System.out.println("Swapped");
						}
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
