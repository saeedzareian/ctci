package ch2.ll;

import java.util.Scanner;

import ch2.ll.Q2_3.node;

public class Q2_6 {
	//using doubly linkedlist
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First:");
		node head = new node(in.nextInt());
		while(in.hasNext()){
				int next = in.nextInt();
				if(next == -1) break;
				node.appendtoEnd(head, new node(next));
		}
		System.out.println("Enter Second:");
		node head2 = new node(in.nextInt());
		while(in.hasNext()){
				int next = in.nextInt();
				if(next == -1) break;
				node.appendtoEnd(head2, new node(next));
		}
		System.out.print("First:");
		node.print(head);
		System.out.print("Second:");
		node.print(head2);
		
		//assuming equal length, otherwise we should iterate through the longer one;
		node pointer = head;
		node pointer2 = head2;
		int addout=0;
		while(pointer!= null && pointer2!= null){
			int res= (pointer.data + pointer2.data +addout);
			addout =  (int) res/10;
			pointer.data  = res %10;
			pointer= pointer.next;
			pointer2= pointer2.next;
		}
		System.out.print("Result:");
		node.print(head);
	}
	
	public static class node{
		public int data;
		public node next;
		public node prev;
		public node(int data){
			this.data = data;
		}
		public  static node prependToNode(node head, node place, node node){ //node is inserted between place and prev.
			node pointer = head;
			
			if(place.data == head.data){
				node.next= head;
				head.prev= node;
				return node;
			}
			while(pointer.data != place.data){
				pointer = pointer.next;
			}
			if(place.prev != null)
				place.prev.next = node;
			node.prev= place.prev;
			node.next = place;
			place.prev= node;
			
			return head;
		}
		public  static node appendAfterNode(node head,node place, node node){ //node is inserted after place.
		node pointer = head;

			while(pointer.data != place.data){
				pointer = pointer.next;
			}
			node.next = place.next;

			if(place.next != null)
				place.next.prev = node;
			place.next= node;
			node.prev= place;
			
			
			return head;
		}
		public  static void appendtoEnd(node head, node node){
			node pointer;
			
			pointer = head;
			while(pointer.next != null){
				pointer = pointer.next;
			}
			pointer.next= node;
			node.prev = pointer;
		}
		public static void print(node head){
			node p = head;
			while(p!=null){
				System.out.print(p.data + " ");
				p = p.next;
			}
		}

	}
}