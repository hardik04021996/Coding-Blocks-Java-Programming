package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q5 {

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
	
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node<Integer> temp1= head1;
		Node<Integer> temp2= head2;

		Node<Integer> mergedhead= null;
		Node<Integer> mergedtail= null;
		
		while(temp1!= null && temp2!= null){
			if(temp1.data < temp2.data)
				{
				if(mergedhead==null)
				   {
					mergedhead=temp1;
					mergedtail=temp1;
					temp1 = temp1.next;
				   }
				else
	               {
					mergedtail.next=temp1;
					temp1=temp1.next;
					mergedtail=mergedtail.next;
				   }
				}
			else
			{
				if(mergedhead==null)
				   {
					mergedhead=temp2;
					mergedtail=temp2;
					temp2 = temp2.next;
				   }
				else
	               {
					mergedtail.next=temp2;
					temp2=temp2.next;
					mergedtail=mergedtail.next;
				   }
			}
		}
		if(temp1==null)
		{
			mergedtail.next = temp2;
		}
		else
		{
			mergedtail.next = temp1;
		}
			
		
		return mergedhead;
		
		
		
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head1= takeinput();
		Node<Integer> head2= takeinput();
		Node<Integer> head= merge(head1,head2);
		print(head);
	}
}
