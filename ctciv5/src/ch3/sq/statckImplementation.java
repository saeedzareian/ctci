package ch3.sq;

import java.util.Scanner;

import ch3.sq.statckImplementation.stack.node;

public class statckImplementation {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		stack stack = new stack();
		while(in.hasNextInt()){
			stack.push(new node(in.nextInt()));
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
