import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PublisherTest {
	private Publisher publisher;
	
	@Before
	public void testSetUp()
	{
		publisher = new Publisher("Ray Borg", "4587 South Elm St");
		assertNotNull(publisher);
	}

	@Test
	public void testGetName() 
	{
		assertEquals("Ray Borg", publisher.getName());
	}

	@Test
	public void testGetAddress()
	{
		assertEquals("4587 South Elm St", publisher.getAddress());
	}

}
