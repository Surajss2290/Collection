package com.example.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
public static void main(String[] args) {

	//Add the element
	List<String> list=new ArrayList<String>();
	list.add("Suraj");
	list.add("sandeep");
	list.add("Roshan");
	list.add("Tushar");
	System.out.println(list);
	//Get the element
	System.out.println(list.get(2));
	
	//check the element is present or not
	System.out.println(list.contains("harsh"));
	//check the index of element
	System.out.println(list.indexOf("Tushar"));
	//remove the element
	list.remove(2);
	System.out.println(list);
	
	
}
}
