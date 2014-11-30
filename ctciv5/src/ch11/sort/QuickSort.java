package ch11.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		while(in.hasNextInt()){
			input.add(in.nextInt());
		}
		input =QuickSorter.sort(input);
		QuickSorter.print(input);
	}
	
	public static class QuickSorter{
		 static ArrayList<Integer> array = null;
		public static ArrayList<Integer> sort(ArrayList<Integer> in){
			array = in;
			
			QuickSorter.sorter(0,array.size()-1);
			QuickSorter.sorter(0,(array.size()-1)/2);
			QuickSorter.sorter((array.size()-1)/2+1,array.size()-1);

			return array;
		}
		public static void sorter(int start , int end){
				if(end-start== 1) return;
				int pivot = (start+end)/2;
				int i=start; 
				int j=end;
				System.out.println("Pivot is:"+pivot);

				while(i<=j){
					while(array.get(i) <= array.get(pivot) && i<=pivot)
						i++;
					while(array.get(j) >= array.get(pivot) && j>=pivot)
						j--;
					if(i<=j){
						int temp = array.get(i);
						array.set(i, array.get(j)) ;
						array.set(j, temp);
						System.out.println("Swapped");
						i++; j--;
					}
					
				}			
		}
		public static void print(ArrayList<Integer> in){
			Iterator<Integer> it = in.iterator();
			while(it.hasNext()) System.out.print(it.next()+ " ");
			System.out.println();
		}
	}
}
