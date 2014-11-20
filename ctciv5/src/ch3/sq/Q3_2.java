package ch3.sq;

import java.util.Scanner;

import ch3.sq.Q3_2.stack.node;

public class Q3_2 {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		stack stack = new stack();
		stack stackOfMins = new stack();
		int min=65536;
		while(in.hasNextInt()){
			int next= in.nextInt();
			if(next<min){
				min = next;
				stackOfMins.push(new node(next));
			}
			stack.push(new node(next));
		}
		stack.print();
		stack.pop();
		stack.print();
		stack.push(new stack.node(5));
		stack.print();
	}
	
	
	public static class stack{
		//public node[] range;
		public node top;
	//	public stack(node[] range){
		public stack(){
			//this.range= range;
		}
	
		public void push(node newNode){
			if(top != null)
				newNode.next= top;
			top = newNode;
		}
		public node pop(){
			if(top==null){
				return null;
			}
			 node ret = top;
			if(top.next != null){
				top = top.next;
			}
			return ret;
		}
		public node peek(){
			return top;
		}
		public  void print(){
			node p = top;
			while(p!= null){
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
