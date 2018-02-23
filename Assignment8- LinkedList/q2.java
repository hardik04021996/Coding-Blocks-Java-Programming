package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q2 {

	public static Node<Integer> takeinput(){
	    Node<Integer> head=null;
	    Node<Integer> tail= null;
	    Scanner s= new Scanner(System.in);
	    int data;
	    System.out.println("enter 1st element:");
	    data= s.nextInt();
	    while(data!= -1){
	    	Node<Integer>NewNode = new Node<Integer>();
	    	NewNode.data= data;
	    	NewNode.next= null;
	    	if(head==null){
	    		head=NewNode;
	    		tail=NewNode;
	    		
	    	}
	    	else
	    	{
	    		tail.next= NewNode;
	    		tail= NewNode;
	    	}
	    	System.out.println("enter next element:");
	    	data=s.nextInt();
	    }
			return head;
	}	
	
	public static void print(Node<Integer> head){
		Node<Integer> temp= head;
		while(temp!= null){
			System.out.print(temp.data+ " ->");
			temp= temp.next;
		}
	}
	
	
	public static Node<Integer> delete(Node<Integer>head, int pos){
		
		if(head==null){
			return null;
		}
		if(pos==1){
			head=head.next;
			return head;
	        }
		head.next= delete(head.next,pos-1);
		return head;
	}
	
	public static void main(String[] args){

		Node<Integer> head= takeinput();
		print(head);
		Scanner s= new Scanner(System.in);
		System.out.println("\n enter position to be deleted:");
		int pos= s.nextInt();
		 head= delete(head,pos);
		print(head);
	}
}
