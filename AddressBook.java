import java.util.*;

public class AddressBook
{
	public String first_name,last_name,address, city;
	public String state,zip,phone,email;
	
	
	public void setDetails(AddressBook person)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter Details of Person-");
		System.out.println("Enter the First Name: ");
		person.first_name = sc.nextLine();
		System.out.println("Enter the Last Name: ");
		person.last_name = sc.nextLine();
		System.out.println("Enter the Address: ");
		person.address = sc.nextLine();
		System.out.println("Enter the City: ");
		person.city = sc.nextLine();
		System.out.println("Enter the State:");
		person.state = sc.nextLine();
		System.out.println("Enter the Zip Code:");
		person.zip = sc.nextLine();
		System.out.println("Enter the Phone Number: ");
		person.phone = sc.nextLine();
		System.out.println("Enter the Email address: ");
		person.email = sc.nextLine();
	}	
	
	public void showDetails(AddressBook person)
	{
		System.out.println();
		System.out.println("Details of " + person.first_name + " Person-");
		System.out.print("First Name: "+person.first_name+ "\nLast Name: "+person.last_name+ "\nAddress: "+person.address+ "\nCity: "+person.city);
		System.out.print("\nstate: "+person.state+ "\nzip code: "+person.zip+ "\nPhone no.: "+person.phone+ "\nEmail: "+person.email);
		System.out.println();
	}
	
	public void editDetails(AddressBook person)
	{	
		Scanner edit = new Scanner(System.in);
		System.out.println("Do you want to edit details of '" +person.first_name+ "' ? Select y/n");
		String check = edit.next();
		if(check.equalsIgnoreCase("y"))
		{
			System.out.println("Enter the First name of person whose details want to edit");
			String name = edit.next();
			
			if(name.equalsIgnoreCase(person.first_name))
			{	
				System.out.println();
				
				System.out.println("Enter the First Name: ");
				person.first_name = edit.nextLine();
				System.out.println("Enter the Last Name: ");
				person.last_name = edit.nextLine();
				System.out.println("Enter the Address: ");
				person.address = edit.nextLine();
				System.out.println("Enter the City: ");
				person.city = edit.nextLine();
				System.out.println("Enter the State:");
				person.state = edit.nextLine();
				System.out.println("Enter the Zip Code:");
				person.zip = edit.nextLine();
				System.out.println("Enter the Phone Number: ");
				person.phone = edit.nextLine();
				System.out.println("Enter the Email address: ");
				person.email = edit.nextLine();
			}
			else
				System.out.println("Name not found");
		}
		else if(check.equalsIgnoreCase("n"))
			System.out.println("You selected 'NO' "); 
		else
			System.out.println("Invalid option");
	}
	
		
	public void deleteDetails(AddressBook person)
	{
		Scanner delete = new Scanner(System.in);
		System.out.println("Do you want to delete the details of " +person.first_name+ " ? Select y/n:");
		String check = delete.next();
		if(check.equalsIgnoreCase("y"))
		{
			System.out.print("Enter the First Name of person whose details want to delete: ");
			String deleteName = delete.next();
			
			if(deleteName.equalsIgnoreCase(person.first_name))
			{
				person.first_name = " ";
				person.last_name = " ";
				person.address = " ";
				person.city = " ";
				person.state = " ";
				person.zip = " ";
				person.phone = " ";
				person.email = " ";
			}
			
			System.out.println("Successfully Deleted details of " +deleteName);
			
		}
		else if (check.equalsIgnoreCase("n"))
			System.out.println("You selected 'NO' ");
		else
			System.out.println("Inavalid option");
			
	}

	
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Address Book");
		AddressBook snehal = new AddressBook();
		AddressBook rushi = new AddressBook();
		
		snehal.setDetails(snehal);   
		snehal.showDetails(snehal); 
		 
		
		snehal.deleteDetails(snehal); 
		//snehal.showDetails(snehal);
		
		
		
	}
}