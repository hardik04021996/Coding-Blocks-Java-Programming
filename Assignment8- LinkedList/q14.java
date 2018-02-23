package linkedListAssignment;

import java.util.Scanner;

import ds.Node;

public class q14 {
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
		
		
		if(head==null)
			return head;
		
		Node<Integer> prev= null;
		Node<Integer> current= head;
		Node<Integer> temp;
		
		
			while(current!=null)
			{
			temp=current.next; 
			current.next=prev;
			prev=current;
			current=temp;
			}
			

		return prev;
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
	
	
	
	public static Node<Integer> operate(Node<Integer>head, int n){
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> temp1=head,temp2,head1,head2,tail1;
		int length= getlength(head);
		int i=1;
		while(i<n){
			temp1=temp1.next;
			i++;
		}
		temp2=temp1.next;
		temp1.next=null;
		head1=reverse(head);
	    head2=reverse(temp2);
		tail1=head1;
		while(tail1.next!=null){
			tail1=tail1.next;
		}
		tail1.next=head2;
		return head1;
	}
	
	public static void main(String[] args){
        Scanner s= new Scanner(System.in);
		Node<Integer> head= takeinput();
		print(head);
		System.out.println();
		System.out.println("enter n:");
		int n= s.nextInt();
		head= operate(head,n);
		print(head);
	}
}
