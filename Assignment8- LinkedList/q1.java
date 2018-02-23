package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q1 {

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
	
	
	public static Node<Integer> insert(Node<Integer>head, int pos, int data){
		Node<Integer>NewNode = new Node<Integer>();
    	NewNode.data= data;
		Node<Integer> temp= head;
		
		if(pos==1){
			NewNode.next=head;
			head=NewNode;
			return head;
	        }
		
		head.next= insert(head.next,pos-1,data);
		return head;
	}
	
	public static void main(String[] args){

		Node<Integer> head= takeinput();
		print(head);
		Scanner s= new Scanner(System.in);
		System.out.println("\n enter position:");
	     int pos= s.nextInt();
	     System.out.println("\n enter data:");
	     int data= s.nextInt();
		 head= insert(head,pos,data);
		print(head);
	}
}
