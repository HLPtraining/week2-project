
public class Book {
	
	private String title;
	private Author author;
	
	public Book(String title, Author author)
	{
		this.title = title;
		this.author = author;
	}
		
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public Author getAuthor() 
	{
		return author;
	}
	public void setAuthor(Author author) 
	{
		this.author = author;
	}
	
	public double calculatePrice()
	{
		int nameLength = 0;
		nameLength = author.getFirstName().length() + author.getLastName().length();
		return (double)nameLength;
	}
	
	@Override                                                    
	public String toString()                                     
	{                                                            
	      return String.format("Title: %s%n%s%nPrice $%,.2f%n", this.title, author, this.calculatePrice());
	         
	} 

}
