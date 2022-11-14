package com.gl.dsa.gradedproject2.question1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DriverClass {
public static void main(String[] args) {
		//Using Scanner Class for getting Output.
		Scanner sc=new Scanner(System.in);
		//Creating objects here.
		Construction con=new Construction();
		Deque<Integer> dq=new LinkedList<Integer>();
		
		System.out.println("Enter total number of floors in the building : ");
		int floors=sc.nextInt();
		
		for(int j=0;j<floors;j++) {
			System.out.println("Enter the floor size given on day "+(j+1)+" : ");
			int ele=sc.nextInt();
			dq.add(ele);	
		}
		//Printing all elements of Deque.
		con.printDeque(dq);
		
		System.out.println("The order of construction is as follows");
		con.orderOfConstruction(dq);
		sc.close();
	}	
}
