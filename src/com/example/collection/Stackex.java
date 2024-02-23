package com.example.collection;

import java.util.Stack;

public class Stackex {
	
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		//Add the element
		s.push("suraj");
		s.push("sandeep");
		s.push("Roshan");
		s.push("Tushar");
		
		System.out.println(s);
		
		//remove the element 
		s.pop();
		System.out.println(s);
		
		//print the top element of list
		System.out.println(s.peek());
		
		//search the element is present or not 
		System.out.println(s.search("Harahs"));
		
		
	}

}
