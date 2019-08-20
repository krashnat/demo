package com.bridgelab.visitor.main;

import com.bridgelab.visitor.Element.Book;
import com.bridgelab.visitor.Element.Fruit;
import com.bridgelab.visitor.Element.ShoppingCardVisitorImpl;

import com.bridgelab.visitor.ItemElement.ItemElement;

public class VisitorMain {
	public static void main(String[] args)
	{
		
			ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
					new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
			calculateTotal(items);
	}

	public static void calculateTotal(ItemElement[] element)
	{
		ShoppingCardVisitorImpl visit=new ShoppingCardVisitorImpl();
		int total=0;
		for(ItemElement e:element)
		{
			total+=e.accept(visit);
		}
		System.out.println(total);
	}
}
