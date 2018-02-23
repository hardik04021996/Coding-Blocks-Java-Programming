package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q4 {
	
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
	
	
	public static Node<Integer> delete(Node<Integer>head){
		
		Node<Integer> temp= head;
			while(temp.next!=null)
			{
				if(temp.data==temp.next.data)
				{
					temp.next= temp.next.next;	
					
				}	
				temp=temp.next;
				
		}
		return head;
	}
	
	public static void main(String[] args){

		Node<Integer> head= takeinput();
		print(head);
		System.out.println();
	    head= delete(head);
		print(head);
	}

}
