package com.interview.programs;

public class BinaryTreeExample {
	public static void main(String[] args){
		new BinaryTreeExample().run();
	}
	static class Node{
		Node left;
		Node right;
		int value;
		
		public Node(int value){
			this.value = value;
		}
	}

	private void run() {
		// TODO Auto-generated method stub
		Node rootnode = new Node(25);
		System.out.println("Building with rootvalue=" +rootnode.value);
		insert(rootnode, 30);
		insert(rootnode, 40);
		insert(rootnode, 45);
		insert(rootnode, 33);
        System.out.println("print the content of  tree in  binary tree order");
		printTreeContents(rootnode);
	}

	private void insert(Node node, int value) {
		// TODO Auto-generated method stub
		if(value<node.value){
			if(node.left !=null){
				insert(node.left, value);
			}else{
				System.out.println("Inserted " +value+ " to the left of node " +node.value);
				node.left = new Node(value);
			}
		}
		else if(value>node.value){
			if(node.right !=null){
				insert(node.right, value);
			}else{
				System.out.println("Inserted " +value+ " to the right of node " +node.value);
				node.right = new Node(value);
			
			}
		}
	}
			public void printTreeContents(Node node){
				if(node !=null){
					printTreeContents(node.left);
					System.out.println("Traversed:" +node.value);
					printTreeContents(node.right);
					//System.out.println("Contents to the right of node are: " +node.value);
				}
				
			}
		
	}


