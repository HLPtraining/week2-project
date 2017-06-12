import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class MagazineTest {
	private Publisher publisher;
	private Magazine magazine;
	private Author author;
	
	@Before
	public void testSetUp()
	{
		author = new Author("Ray", "Lexington","Fort Worth");
		publisher = new Publisher("Shawn Washington Org", "5410 East Main St");
		magazine = new Magazine("Sports Illustrated", author, publisher);
	}
	
	@Test
	public void testMagazine()
	{
		assertNotNull(magazine);
	}
	
	@Test
	public void testCalculatePrice() {
		//raylexington is 12 * 12 = 144
		assertEquals(144, magazine.calculatePrice(), .001);
	}

	@Test
	public void testGetPublisher() {
		assertEquals(publisher, magazine.getPublisher());
	}

}
