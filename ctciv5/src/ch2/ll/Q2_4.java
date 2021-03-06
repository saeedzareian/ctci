package ch2.ll;

import java.util.Scanner;

import ch2.ll.Q2_3.node;

public class Q2_4 {
	//using doubly linkedlist
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		node head = new node(in.nextInt());
		System.out.println("\neverything place around "+head.data);
		int pivot = head.data;
		while(in.hasNextInt()){
				int next = in.nextInt();
				if(next > pivot){
					node.appendAfterNode(head, head, new node(next));
				}else{
					head= node.prependToNode(head, head, new node(next));
				}
		}
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