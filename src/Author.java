
public class Author {
	
	private String firstName;
	private String lastName;
	private String city;
	
	public Author(String firstName, String lastName, String city)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString()
	{
		return String.format("Author: %s %s%nCity: %s",this.firstName, this.lastName, this.city);
	}

}
