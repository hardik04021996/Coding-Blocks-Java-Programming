package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q11 {
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
	
	
	
	public static Node<Integer> sort(Node<Integer>head){
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> currentNode=head,prev = null;
			while(currentNode.next != null){
				prev=null;
				if(currentNode.next.data % 2 !=0){	
					prev=currentNode.next;
					currentNode.next=currentNode.next.next;
					prev.next=head;
					head=prev;
					//currentNode= currentNode.next;
				}
				else{
					currentNode = currentNode.next;
				}	
			}
	
		return head;
	}
	

	public static void main(String[] args){

		Node<Integer> head= takeinput();
		print(head);
		System.out.println();
		head= sort(head);
		print(head);
	}
	
}
