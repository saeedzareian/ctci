package ch11.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		while(in.hasNextInt()){
			input.add(in.nextInt());
		}
		input =MergeSorter.sort(input);
		MergeSorter.print(input);
	}
	
	public static class MergeSorter{
		 static ArrayList<Integer> array = null;
		public static ArrayList<Integer> sort(ArrayList<Integer> in){
			array = in;
			
			MergeSorter.sorter(0,array.size()-1);
			
			return array;
		}
		public static void sorter(int start , int end){
			System.out.println("S"+start+","+end);
			if(end-start == 0){
			
			}else if(end-start ==1){
				if(array.get(start)> array.get(end)){
					int temp = array.get(start);
					array.set(start, array.get(end)) ;
					array.set(end, temp);
					System.out.println("Swapped");
				}
			}else{
				sorter(start, (start+end)/2);
				sorter( (start+end)/2+1,end);
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				int i =  start;
				int j =(start+end)/2+1;	
				
//				System.out.print("list: ");
//				Iterator<Integer> it = array.iterator();
//				while(it.hasNext()) System.out.print(it.next()+ " ");
//				System.out.println();
				
				while(i<=(start+end)/2+1 &&  j<=end){
					if(array.get(i)< array.get(j) ){
						System.out.println("i is:"+i);
						tempList.add(array.get(i++));
					}else {
						System.out.println("j is:"+j);
						tempList.add(array.get(j++));
					}
				}
				while(i<(start+end)/2+1){
						tempList.add(array.get(i++));
				}
				while(j<end){
					tempList.add(array.get(j++));
				}
//				System.out.println();  
//				System.out.print("TEMP: ");
//				Iterator<Integer> it1 = tempList.iterator();
//				while(it1.hasNext()) System.out.print(it1.next()+ " ");
				for(i=start ; i<=end; i++){
					array.set(i, tempList.get(i-start));
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
