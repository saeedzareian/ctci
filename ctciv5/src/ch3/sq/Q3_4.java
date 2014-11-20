package ch3.sq;

import java.util.Scanner;


public class Q3_4 {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		
		stack<node> a = new stack<node>();
		stack<node> b = new stack<node>();
		stack<node> c = new stack<node>();

		//pushing
		while(in.hasNextInt()){
			int next= in.nextInt();
			if(next == -1) break;	
			System.out.println("Adding:"+next);
			a.push(new node(next));
		}
		move(a.length,a,b,c);
		
		
		//printing
		System.out.print("A:");
		a.print();
		System.out.print("B:");
		b.print();
		System.out.print("C:");
		c.print();
	}
	public static void move(int n, stack from, stack to, stack helper){
		if(n==0)
			return;
		move(n-1, from, helper, to);
		to.push( from.pop());
		move(n-1, helper, to, from);

	}
	
	public static class stack<Type extends node> extends node{
		public Type top;
		public int length;
		public stack(){
			super();
		}
	
		public void push(Type newNode){
			if(top != null)
				newNode.next= top;
			top = newNode;
			length++;
		}
		public Type pop(){
			if(top==null){
				return null;
			}
			 Type ret = top;
			if(top.next != null){
				top = (Type) top.next;
			}
			length--;
			return ret;
		}
		public node peek(){
			return top;
		}
		public  void print(){
			node p = top;
			int c = 0;
			while(p!= null && c++<length){
				System.out.print(p.data+" ");
				p = p.next;
			}
			System.out.println();
		}
	
	}
	public static class node{
		int data;
		node next;
		public node(){
		}
		public node(int data){
			this.data= data;
		}
	}
}
