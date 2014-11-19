package ch2.ll;

import java.util.Scanner;

public class Q2_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		node head = new node(in.nextInt());
		while(in.hasNextInt()){
			node.append(head, new node(in.nextInt()));
		}
		head= node.delete(head,new node(2));
		node.print(head);
	}
	
	public static class node{
		public int data;
		public node next;
		public node(int data){
			this.data = data;
		}
		public  static void append(node head, node node){
			node pointer;
			
			pointer = head;
			while(pointer.next != null){
				pointer = pointer.next;
			}
			pointer.next= node;
		
		}
		public static void print(node head){
			node p = head;
			while(p!=null){
				System.out.print(p.data + " ");
				p = p.next;
			}
		}
		public static node delete(node head, node node){
			node pointer = head;
			
			if(node.data == head.data){
				return head.next;
			}
			node prev=pointer;
			while(pointer.data != node.data){
				prev= pointer;
				pointer = pointer.next;
			}
			prev.next = pointer.next;
			
			return head;
		}
		/*public static void removeDups(node head){
			node current = head;
			node searcher = head;
			node prev=head;
			while(current != null){
				while(searcher != current){
					//System.out.println(current.data+"|"+searcher.data);
					if(searcher.data == current.data){
						prev.next = current.next;//removing current,bc it was there before.
						//System.out.println("done");
						break;				
					}
					searcher = searcher.next;
				}
				prev = current;
				current = current.next;
				searcher = head;
			}
		}*/
	}
}