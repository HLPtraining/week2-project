import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AuthorTest {
	private Author author;

	@Before
	public void testSetUp() 
	{
		author = new Author("Jerry", "Sienfield", "Boston");
	}
	
	@Test
	public void testAuthor() 
	{
		assertNotNull(author);
	}

	@Test
	public void testGetFirstName() 
	{
		assertEquals("Jerry", author.getFirstName());
	}

	@Test
	public void testGetLastName()
	{
		assertEquals("Sienfield", author.getLastName());
	}

	@Test
	public void testGetCity() 
	{
		assertEquals("Boston", author.getCity());
	}

}
