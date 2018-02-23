package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q13 {

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
	
	public static int getlength(Node<Integer> head){
		Scanner s= new Scanner(System.in);
		
	    Node<Integer> temp= head;
	    int count=0;
	    while(temp!= null){
	    	count++;
	    	
	    	temp=temp.next;
	    	
	    }
	    return count;
		
	}
	
	public static Node<Integer> append(Node<Integer>head, int n){
		if(head == null || head.next == null){
			return head;
		}
		int i=1;
		int length= getlength(head);
		Node<Integer> temp=head,prev,prevfast;
		while( i< length-n){
			temp=temp.next;
			i++;
		}
		prev=temp.next;
		temp.next=null;
		prevfast=prev;
		while(prevfast.next!=null){
			prevfast=prevfast.next;
		}
		prevfast.next=head;
		head=prev;
		return head;
	}
	

	public static void main(String[] args){

		Scanner s= new Scanner(System.in);
		Node<Integer> head= takeinput();
		print(head);
		System.out.println();
		System.out.println("enter n:");
	    int n= s.nextInt();
		head= append(head, n);
		print(head);
	}
	
}
	

