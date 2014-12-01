package ch11.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] a){
		Integer[] inp = null;
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		Scanner inStream =  new Scanner(System.in);
		while(inStream.hasNextInt()){
			inputList.add(inStream.nextInt());
		}
		inp = inputList.toArray(new Integer[inputList.size()]);
		int index = BinarySearcher.search(inp , 5);
		System.out.println("RES:"+index);
	}
	
	public static class BinarySearcher{
		public static int search(Integer[] array, int value){
			return searcher (array, value, 0, array.length-1);
		}
		private static int searcher(Integer[] array, int value, int start, int end){
			int mid = (start+end)/2;
			while(start<end){
				if(array[mid]>value){
					//go to right portion
					end = mid-1;
				}else if(array[mid]<value){
					//go to  left portion
					start = mid+1;
					
				}else{
					return mid;
				}
			}
			return -1;
		}
	}
}
