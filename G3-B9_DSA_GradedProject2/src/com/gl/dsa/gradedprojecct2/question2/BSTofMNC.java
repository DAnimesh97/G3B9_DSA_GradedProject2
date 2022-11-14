package com.gl.dsa.gradedprojecct2.question2;

public class BSTofMNC {
	
	public Node node;   
    Node previous = null; 
    public Node NewHeadd = null;
    public void BSTtoSKEWW(Node root)
    {
        if(root == null)return;
        BSTtoSKEWW(root.getLeft());
        Node rightNode = root.getRight();
      //This updates New head to hold new root.  
        if(NewHeadd == null)   

        {
            NewHeadd = root;
            root.setLeft(null);
            previous = root;
        }
        else
        {
       /*update the right of predecessor and also     
        	the predecessor to accomodate next node*/
        	previous.setRight(root); 
            root.setLeft(null);  
            previous = root;
        }
        BSTtoSKEWW(rightNode);
    }  
    public void Displayy(Node root)
    {
        if(root == null)return;
        System.out.print(root.getData() + " ");
        Displayy(root.getRight());       
    }
}
