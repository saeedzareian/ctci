package ch3.sq;

import java.util.Scanner;


public class Q3_3 {
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		
		stack<stack> setOfStacks = new stack<stack>();
		int capacity = 2;
		stack<node> currentStack = new stack<node>();
		//pushing
		while(in.hasNextInt()){
			int next= in.nextInt();
			if(next == -1) break;
			if(currentStack.length<capacity){

			}else{
				System.out.println("Adding new stack");
				currentStack = new stack<node>();
				setOfStacks.push(currentStack);
			}
			System.out.println("Adding:"+next);
			currentStack.push(new node(next));
		}
		//popping
		while(setOfStacks.length>0){
			//get the top stack, fetch the value
			stack<node> top= setOfStacks.pop();
			node n = top.pop();
			if(top.length>0){
				setOfStacks.push(top);
			}
		}
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
			while(p!= null){
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
