package ch3.sq;

import java.util.Scanner;

import ch3.sq.Q3_7.queue.node;


public class Q3_7 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		queue queue = new queue();
		while(in.hasNextInt()){
			queue.enqueue(new node(in.nextInt()));
		}
		queue.print();
		queue.dequeue();
		queue.print();
		queue.enqueue(new node(5));
		queue.print();
	}
	
	public static class queue{
		public node first, last;
		public void enqueue(node newNode){
			if(last == null){
				first= last= newNode;
			}else{
				last.next= newNode;
				last  = newNode;
			}
		}
		public node dequeue(){
			node ret= first;
			if(first != null)
				first = first.next;
			return ret;
		}
		public void print(){
			node p = first;
			while(p!=null){
				System.out.print(p.data+" ");
				p = p.next;
			}
			System.out.println();
		}
		public static class node{
			int data;
			node next;
			public node(int data){
				this.data= data;
			}
		}
	}
}
