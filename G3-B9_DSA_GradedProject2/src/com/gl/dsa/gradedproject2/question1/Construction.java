package com.gl.dsa.gradedproject2.question1;

import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class Construction {
	public void orderOfConstruction(Deque<Integer> dq) {
		
		Stack<Integer> st=new Stack<Integer>();
		int dqSize=dq.size();
		
		int i=1;
	    while(i<=dqSize) {
	    	
	    //Saving the head of Deque into Temp.
	    	int temp=dq.remove();
	     
	    //If Deque is empty then print Stack Elements.
	     if(dq.isEmpty()) {
	    	 st.push(temp);
	    	 printStack(st,i,dq);
	    	 break;
	     }
	     
	     /* If a floor size is smaller than the next,
	     no construction happens on that day */
	     
	     if(temp<dq.getFirst()) {
	    	 st.push(temp);
	    	 System.out.println("Day "+i+" - ");	    	 
	     }
	     
	      /* If a floor size is greater than the next,
	      print all floors from Stack */
	     if(dq.isEmpty() || temp>=dq.getFirst()){
	    	 st.push(temp);
	    	 printStack(st,i,dq);	    	 	
	     	}
	     i++;
	    }
	}

	public void printDeque(Deque<Integer> dq)
	{
	    System.out.println("Floor Sizes provided on different days : ");
	   
	   //Iterate through Deque. 
	    int i=1;
	    while(i<=dq.size()) {
	     int temp=dq.remove();
	     System.out.println("Day "+i+" - "+ temp);
	     dq.addLast(temp);
	     i++;
	    }	 
	}
	
	public void printStack(Stack<Integer> st,int day,Deque<Integer> dq) {
		
		System.out.print("Day "+day+" - ");		
		while(!st.isEmpty()) {
		/* Checking for any larger value than the top of Stack
			in Deque.If not present then continue popping Stack
			else stop popping from Stack. */
			if(!hasLargerFloor(dq,st.peek()))
				System.out.print(st.pop()+" ");	
			else 
				break;			
		}			
		System.out.println("");
	}
	
	public boolean hasLargerFloor(Deque<Integer> dq,int num) {
		Iterator<Integer> it=dq.iterator();
		while(!dq.isEmpty() && it.hasNext()) {
			if(it.next()>num) 
				return true;				
			}
		return false;
	}
}
