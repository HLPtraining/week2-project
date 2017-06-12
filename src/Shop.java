import java.util.ArrayList;
import java.util.Date;


public class Shop {

	public static ArrayList<Book> shop;
	
	public Shop() 
	{
		shop = new ArrayList<Book>();
	}
	
	public void displayShop()
	{
		for(Book book: shop)
		{
			if(book instanceof ElectronicBook)
			{
				System.out.printf("Electronic Book%n%s%n", book);
			}
			else if(book instanceof Magazine )
			{
				System.out.printf("Magazine%n%s%n", book);
			}
			else if(book instanceof Book)
			{
				System.out.printf("Book%n%s%n", book);
			}
			
		}
	}
	
	public void addBook(String title, Author author)
	{
		shop.add(new Book(title, author));
	}
	
	public void addMagazine(String title, Author author, Publisher publisher)
	{
		shop.add(new Magazine(title,author,publisher));
	}
	
	public void addElectronicBook(String title, Author author, Date date)
	{
		shop.add(new ElectronicBook(title, author, date));
	}

	public int getShopSize()
	{
		return shop.size();
	}
}
