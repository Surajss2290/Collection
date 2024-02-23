package com.example.collection;

import java.util.Vector;

public class Vectorex {
	
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		//print all list
		System.out.println(v);
		
		//check the capacity of vector
		System.out.println(v.capacity());
		
		//check the element is present or not 
		System.out.println(v.contains(10));
		
		//first element
		System.out.println(v.firstElement());
		
		//last element
		System.out.println(v.lastElement());
		
		//get element of specified index
		System.out.println(v.get(4));
		
		//get index of specified index
       System.out.println(v.indexOf(6));
       
       //remove the element specified index
       System.out.println(v.remove(0));
       System.out.println(v);
       
       //check the size of list
       System.out.println(v.size());
	}

}
