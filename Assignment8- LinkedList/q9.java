package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q9 {
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
	
	public static int mid(Node<Integer> head){
		
		int result=1;
		Node<Integer> slow= head;
		Node<Integer> fast= head;
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			result++;
			
		}
		return result;
		
	}
	
	
	public static boolean check(Node<Integer>head){
		
		Node<Integer> slow= head;
		Node<Integer> fast;
		int midIndex=mid(head);
		int length=getlength(head);
		int i=1;
		while(i<=midIndex){
		 int j=1;
		 fast=head;
		 while(j!=length){
			fast=fast.next;
			j++;
		 }
		 if(slow.data!=fast.data){
			return false;
		 }
		 slow=slow.next;
		 length--;
		 i++;
		 }
		return true;
		
	}
	
	public static void main(String[] args){

		Node<Integer> head= takeinput();
		print(head);
		System.out.println();
		boolean answer= check(head);
		System.out.println(answer);
		
	}
	

}
