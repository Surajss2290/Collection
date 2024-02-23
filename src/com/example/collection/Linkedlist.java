package com.example.collection;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		//add element
		list.add(0);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		System.out.println(list);
		
		//get first element
		System.out.println(list.getFirst());
		
		//get last
		System.out.println(list.getLast());
		
		//remove first
		System.out.println(list.removeFirst());
		
		//remove last
		System.out.println(list.removeFirst());
		
		//remove specified index
		System.out.println(list.remove(0));
		
		System.out.println(list);
	}

}
