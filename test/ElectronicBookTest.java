import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;


public class ElectronicBookTest {
	private Author author;
	private ElectronicBook eBook;
	
	@Before
	public void testSetUp()
	{
		author = new Author("Michael", "Jordan", "Raleigh");	
		eBook = new ElectronicBook("Java How to program", author, new Date());
	}
	
	
	@Test
	public void testElectronicBook() 
	{
		assertNotNull(eBook);

	}
	
	@Test
	public void testCalculatePrice()
	{
		//must be one dollar
		assertEquals(1 ,eBook.calculatePrice(), .01);
		
	}

	@Test
	public void testIsTransmitted() 
	{
		
		assertEquals("Transmitted", eBook.isTransmitted());
		
	}

}
