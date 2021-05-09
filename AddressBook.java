import java.util.*;

public class AddressBook
{
	public String name, address, city;
	public String state_zip,phone,email;
	
	
	public void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		name = sc.nextLine();
		System.out.println("Enter the Address: ");
		address = sc.nextLine();
		System.out.println("Enter the City: ");
		city = sc.nextLine();
		System.out.println("Enter the State and Zip Code:");
		state_zip = sc.nextLine();
		System.out.println("Enter the Phone Number: ");
		phone = sc.nextLine();
		System.out.println("Enter the Email address: ");
		email = sc.nextLine();
	}	
	
	public void showDetails()
	{
		System.out.println();
		System.out.print("Name: "+name+ "\nAddress: "+address+ "\nCity: "+city);
		System.out.print("\nstate and Zip code: "+state_zip+ "\nPhone no.: "+phone+ "\nEmail: "+email);
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Address Book");
		AddressBook snehal = new AddressBook();
		AddressBook rushi = new AddressBook();
		
		snehal.setDetails();
		System.out.println();
		rushi.setDetails();
		
		
		snehal.showDetails();
		System.out.println();
		rushi.showDetails();
	}
}