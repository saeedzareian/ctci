package ch3.sq;

import java.util.Scanner;

import ch3.sq.Q3_1.stack.node;

public class Q3_1 {
		//not complete
	public static void main(String[] args){
		Scanner in  = new Scanner(System.in);
		stack.range= new node[100];
		stack.limits = new int[] {2,2,2};
		stack.starts= new int[] {0,2,4};
		int limit =2;
		
		stack stack1 = new stack(0);
		stack stack2 = new stack(1);
		stack stack3 = new stack(2);

		while(in.hasNextInt()){
			int next=  in.nextInt();
			if(next == -1) break;
			stack1.push(new node(next));
		}
		while(in.hasNextInt()){
			int next=  in.nextInt();
			if(next == -1) break;
			stack2.push(new node(next));
		}
		while(in.hasNextInt()){
			int next=  in.nextInt();
			if(next == -1) break;
			stack3.push(new node(next));
		}
		stack1.print();
		stack2.print();
		stack3.print();
	}
	
	
	public static class stack{
		public static int[] starts;
		public static node[] range;
		public static int[] limits;
		int end , index;
		public stack(int index){
			this.index = index;
			this.end = starts[index];
		}
	
		public void push(node newNode){
			range [end++] = newNode;
			if(end == limits[index]){ //push
				//push for twice (means limit-start fwd)
				int newLimit = limits[index]+ (limits[index]);
				int p = newLimit;
				while(p<99){
					range[p+1]= range[p];
					//System.out.println("Movin:"+range[p+1]);
					p++;
				}
				if(index<2){//next groupss
					int pindex = index+1;
					while(pindex<=2){
						starts[pindex]+=(limits[index]-starts[index]);
						System.out.println("start of "+pindex+" been changed to:"+starts[pindex]);
						//1 2 -1 3 4 -1 5 6 -1
						pindex++;					
					}
				}
				limits[index] = newLimit;
				
				System.out.println("Limit has been changed to:"+limits[index]);
				
			}
		}
		public node pop(){
			if(starts[index] == end){
				return null;
			}
			return range[end--];
		
		}
		public node peek(){
			return range[end];
		}
		public  void print(){
			int p = starts[index];
			while(p!= end){
				System.out.print(range[p++].data+" ");
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
