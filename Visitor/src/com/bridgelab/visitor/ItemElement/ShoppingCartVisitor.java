package com.bridgelab.visitor.ItemElement;

import com.bridgelab.visitor.Element.Book;
import com.bridgelab.visitor.Element.Fruit;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);

}
