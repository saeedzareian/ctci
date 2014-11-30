package ch3.sq;

import java.util.Scanner;

import ch3.sq.Q3_5.stack.node;

public class Q3_5 {
	//output is from stack 2, when something is going to be inserted, we move everything to 
	// stack1, then push new thing to stack2, and then put back everything on top of stack2.
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		stack stack1 = new stack();
		stack stack2 = new stack();
	
		while(in.hasNextInt()){
			int next = in.nextInt();
			if(next == -1) break;
			while(stack2.length >0){
				stack1.push(stack2.pop());
			}
			stack2.push(new node(next));
			while(stack1.length >0){
				stack2.push(stack1.pop());
			}
		}
		System.out.println("First:" +stack2.peek().data);
	}
	
	
	public static class stack{
		//public node[] range;
		public node top;
		int length;
	//	public stack(node[] range){
		public stack(){
			//this.range= range;
			length= 0;
		}
	
		public void push(node newNode){
			if(top != null)
				newNode.next= top;
			top = newNode;
			length++;
		}
		public node pop(){
			if(top==null){
				return null;
			}
			 node ret = top;
			if(top.next != null){
				top = top.next;
			}
			length --;
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
