package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q10b {

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
	
	
	public static Node<Integer> reverse(Node<Integer>head){
		
		
		if(head==null || head.next==null)
			return head;
		
		Node<Integer> smalloutput= reverse(head.next);
		Node<Integer> temp= smalloutput;
		while(temp.next!= null){
			temp=temp.next;
		}
		
		temp.next=head;
		head.next=null;
		return smalloutput;
		
		
	}
	
	public static void main(String[] args){

		Node<Integer> head= takeinput();
		print(head);
		System.out.println("\n");
		head= reverse(head);
		print(head);
	}
	
}
