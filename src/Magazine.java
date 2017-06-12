
public class Magazine extends Book {
	
	private Publisher publisher;

	public Magazine(String title, Author author, Publisher publisher)
	{
		super(title, author);
		this.publisher = publisher;	
	}

	public Publisher getPublisher() 
	{
		return publisher;
	}

	public void setPublisher(Publisher publisher) 
	{
		this.publisher = publisher;
	}
	
	@Override
	public double calculatePrice()
	{
		//call the superclasses method of calculate price then multiply by 12
		return 12 * (super.calculatePrice());
	}
	
	@Override                                                    
	public String toString()                                     
	{                                                         
	      Author author = super.getAuthor();
	      return String.format("Title: %ss%nAuthor: %s%nCity: %s%n%s%nPrice $%,.2f%n", super.getTitle(),author.getFirstName() + " " + author.getLastName(),author.getCity(),publisher.toString(),this.calculatePrice());
	         
	}

}
