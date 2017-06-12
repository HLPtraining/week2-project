import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BookTest {
	private Author author;
	private Book book;
	
	@Before
	public void testSetUp(){
		author = new Author("Charlie", "Daniels", "Austin");
		book = new Book("Eye of the Tiger", author);
	}

	@Test
	public void testBook() {
		assertNotNull(book);
	}

	@Test
	public void testGetTitle() {
		assertEquals("Eye of the Tiger", book.getTitle());
	}

	@Test
	public void testGetAuthor() {
		assertEquals(author , book.getAuthor());
	}
	
	@Test
	public void testCalculatePrice() 
	{
		String name = author.getFirstName() + author.getLastName();
		double price = (name.length());
		assertEquals(price, book.calculatePrice(), .01);
	}

}
