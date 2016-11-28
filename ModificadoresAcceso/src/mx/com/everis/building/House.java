package mx.com.everis.building;

import mx.com.everis.library.Book;

public class House extends Book{
	public House(){
		Book book = new Book();
		book.author="ABC";
		book.modifyTemplate();
	}

}
