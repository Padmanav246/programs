package oops;
import java.util.*;

class Book
{
	public String name;
	public int pages;
	Book(String name,int pages)
	{
		this.name=name;
		this.pages=pages;
	}
}
class Library
{
	private  List<Book> books;
	Library(List<Book> books)
	{
		this.books=books;
	}
	public List<Book> getbooks()
	{
		return books;
	}
}
public class Composition {
	public static void main(String...strings)
	{
		Book b1=new Book("Learning java",345);
		Book b2=new Book("Code with react",565);
		List<Book> book=new ArrayList<Book>();
		book.add(b1);
		book.add(b2);
		Library l1=new Library(book);
		List<Book> books=l1.getbooks();
		for(Book b11:books)
		{
			System.out.println("Name = "+b11.name+" , Pages= "+b11.pages);
		}
		
	}
}
