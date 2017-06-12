import static org.junit.Assert.*;
import java.util.Date;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class ShopTest {
	
	static Shop shop = new Shop();
	Author author1 = new Author("Christopher", "Wakin", "Fort Worth");
	Author author2 = new Author("Jerry", "Smith", "Dallas");
	Author author3 = new Author("Ray", "Avelar", "Fort Worth");
	Author author4 = new Author("Victor", "Martinez", "Garland");
	Author author5 = new Author("Alex", "Olmos", "Cleburn");
	Author author6 = new Author("Charly", "Daniels", "El Paso");
	Publisher publisher1 = new Publisher("James Heffield Company", "154 main st");
	Publisher publisher2 = new Publisher("Trailer Tires Corp", "154 main st");
	static int size = 0;
	
	@Test
	public void testShopConstructor() 
	{
		assertNotNull(shop);
	}
	
	
	@Test
	public void testAddBook()
	{
		
		shop.addBook("The last of the Mohicans", author1);
		size++;
		assertEquals(size, shop.getShopSize());
		
		shop.addBook("Last Earth", author2);
		size++;
		assertEquals(size, shop.getShopSize());
	}
	
	@Test
	public void testAddMagazine()
	{
		shop.addMagazine("Ultimate Warrior", author3, publisher1);
		size++;
		assertEquals(size, shop.getShopSize());
		
		shop.addMagazine("The Lake", author4, publisher2);
		size++;
		assertEquals(size, shop.getShopSize());
	}
	
	@Test
	public void testAddElectronicBook()
	{
		Date date = new Date();
		shop.addElectronicBook("Aurora Borealis" , author5, date);
		size++;
		assertEquals(size, shop.getShopSize());
		
		shop.addElectronicBook("Trailers", author6, date);
		size++;
		assertEquals(size, shop.getShopSize());
	}
	
	
	@Test
	public void testDisplayShop()
	{
		shop.displayShop();
	}

}
