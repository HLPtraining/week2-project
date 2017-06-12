import java.util.Date;

public class ElectronicBook extends Book implements Transmitted{
	
	private Date dateSent;

	public ElectronicBook(String title, Author author, Date dateSent) {
		super(title, author);
		
		this.dateSent = dateSent; // assigns date no specific format (default)
			
	}
	
	public Date getDateSent() 
	{
		return dateSent;
	}

	public void setDateSent(Date dateSent)
	{
		this.dateSent = dateSent;
	}

	@Override
	public double calculatePrice()
	{
		return 1.0;
	}
	
	@Override                                                    
	public String toString()       
	{     
		Author author = super.getAuthor();                                   
	      return String.format("Title: %s%nAuthor: %s%nCity: %s%nPrice $%,.2f%n%s%nDate Sent: %s%n",super.getTitle(),author.getFirstName() + " " + author.getLastName(),author.getCity(),this.calculatePrice(), this.isTransmitted(), this.dateSent.toString());
	         
	}

	public String isTransmitted()
	{
		return "Transmitted";
	} 

}
