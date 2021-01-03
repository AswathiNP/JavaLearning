
public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	Person(String fname,String lname,int ag)
	{
		super();
		firstName=fname;
		lastName=lname;
		age=ag;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "[firstName="+firstName+" lastName="+lastName+" age="+age+"]";
		
	}

}
