package binaryTreeAssignment1;

import java.util.Scanner;

import DataStructures.QueueEmptyException;
import DataStructures.QueueList;

public class BTA1_Q5 {

	public static BinaryTreeNode<Integer> takeinput() throws QueueEmptyException{
		Scanner s= new Scanner(System.in);
		System.out.print("enter root data:");
		int rootdata = s.nextInt();
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>();
		root.data= rootdata;
		
		QueueList<BinaryTreeNode<Integer>> pendingNodes= new QueueList<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer>currentNode= pendingNodes.dequeue();
			System.out.println("enter left child of" + currentNode.data);
			int leftData= s.nextInt();
			if(leftData!=-1){
				BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<>();
				leftChild.data= leftData;
				currentNode.left= leftChild;
				pendingNodes.enqueue(leftChild);
			}
			System.out.println("enter right child of" + currentNode.data);
			int rightData= s.nextInt();
			if(rightData!=-1){
				BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<>();
				rightChild.data= rightData;
				currentNode.right= rightChild;
				pendingNodes.enqueue(rightChild);
		 }
		}
			return root;
	}
		
	
	public static void print(BinaryTreeNode<Integer> root){
		
		if(root == null){
			return;
		}
		String tobeprinted = root.data + " : ";
		if(root.left!= null){
			tobeprinted+= root.left.data+ " , ";
		}
		if(root.right!= null){
			tobeprinted+= root.right.data;
		}
		System.out.println(tobeprinted);
		print(root.left);
		print(root.right);			
}

	public static void noSibling(BinaryTreeNode<Integer> root){
		
		if(root==null){
			return ;
		}
		if(root.left!=null && root.right==null) {
			System.out.println(root.left.data);
		}
		if(root.right!=null && root.left==null) {
			System.out.println(root.right.data);
		}
		noSibling(root.left);
		noSibling(root.right);		
	}
	
	public static void main(String args[]) throws Exception{
	    Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeinput();
		print(root);
		System.out.println("nodes with no sibling:");
		noSibling(root);
	}		
}
