package com.gl.dsa.gradedprojecct2.question2;

public class DriverClass {
	
	static BSTofMNC tree = new BSTofMNC();
	
	public static void main(String[] args) {
		
		tree.node = new Node(50);
        tree.node.setLeft(new Node(30));
        tree.node.setRight(new Node(60));
        tree.node.getLeft().setLeft(new Node(10));
        tree.node.getRight().setLeft(new Node(55));
    // Converts the Binary search TREE to a Skewed one.   
        tree.BSTtoSKEWW(tree.node); 
    // Prints the Skewed Tree. 
        tree.Displayy(tree.NewHeadd); 
	}
}
