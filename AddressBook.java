import java.util.*;	


class Contact{
	
	protected static ArrayList<String> first_name = new ArrayList<String>();
	protected static ArrayList<String> last_Name = new ArrayList<String>();
	protected static ArrayList<String> address = new ArrayList<String>();
	protected static ArrayList<String> city = new ArrayList<String>();
	protected static ArrayList<String> state = new ArrayList<String>();
	protected static ArrayList<String> zip = new ArrayList<String>();
	protected static ArrayList<String> phone = new ArrayList<String>();
	protected static ArrayList<String> email = new ArrayList<String>();
	
	protected static Map<String,AddressBook> multipleBooks = new HashMap<String,AddressBook>();
	
}
	
	

public class AddressBook extends Contact{
	
	// Add Multiple Address Books
	
	public static void setMultipleBook(){
		Scanner user = new Scanner(System.in);
		System.out.println("** List of Address Books **");
		for(Map.Entry m :multipleBooks.entrySet()){
			System.out.println(m.getKey());
		}
		while(true){
		System.out.println(">>Enter key of AddressBook which you have to access: ");
		String key = user.nextLine();
		if(multipleBooks.containsKey(key)){
			chooseOption(multipleBooks.get(key));
			break;
		}
		else
			System.out.println("Invalid Key. Enter Correct key:");
		}
	}
	
	
	//Choose Differnt option for fill Details 
	public static void chooseOption(AddressBook book)
	{
		Scanner user = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1)Add details of person\n2)Show details of person\n3)Delete details of person\n4)Edit the details of person\n5)Goto other AddressBook\n6)Exit");
			System.out.println();
			System.out.println(">>Choose the option from below:");
			int select = user.nextInt();
			
			switch(select)
			{
				case 1:
					book.setDetails();
					break;
					
				case 2:
					book.showDetails();
					break;
				
				case 3:
					book.deleteDetails();
					break;
					
				case 4:
					book.editDetails();
					break;
					
				case 5:
					setMultipleBook();
					break;
				
				case 6:
					System.exit(0);
					break;
				default : 
					System.out.println("Invalid Input");
					
					
			}
		}
		
	}
	
	
	
	//Set detalis for new person
	public void setDetails()
	{
		Scanner sc = new Scanner(System.in);
	
		while(true)
		{
			System.out.println();
			System.out.println("Add details for New person"); 
			
			System.out.println("Enter the First Name: ");
			String firstName = sc.nextLine();
			boolean check = checkDuplicate(firstName);
			if(check == false)
				first_name.add(firstName);
			else{
				System.out.println("Person is already exist");
				continue;
			}
			System.out.println("Enter the Last Name: ");
			last_Name.add(sc.nextLine());
			System.out.println("Enter the Address: ");
			address.add(sc.nextLine());
			System.out.println("Enter the City: ");
			city.add(sc.nextLine());
			System.out.println("Enter the State:");
			state.add(sc.nextLine());
			System.out.println("Enter the Zip Code: ");
			zip.add(sc.nextLine());
			System.out.println("Enter the Phone Number: ");
			phone.add(sc.nextLine());
			System.out.println("Enter the Email Address: ");
			email.add(sc.nextLine());
			
			System.out.println();
			System.out.println("Do you want to Add another person details? Select y/n:");
		
			String choose = sc.nextLine();
			if(choose.equalsIgnoreCase("y"))
			{
				continue;
			}
				
			else if(choose.equalsIgnoreCase("n"))
			{
				System.out.println("Thank you");
				break;
			}
			else
				System.out.println("Invalid input");
		}

	}	
	
	//Shows details of person who present in book
	public void showDetails()
	{
		Scanner shows = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Enter the First name of person whose details want to Show:");
		String showName = shows.next();
		int position =first_name.indexOf(showName);
			
		if(first_name.contains(showName))
		{
			System.out.println(first_name.get(position));
			System.out.println(last_Name.get(position));
			System.out.println(address.get(position));
			System.out.println(city.get(position));
			System.out.println(state.get(position));
			System.out.println(zip.get(position));
			System.out.println(phone.get(position));
			System.out.println(email.get(position));
			
		}
		else
			System.out.println("Thie Person is not available in book ");
		
	
	}
	
	//Edit the details of persons using name of person
	public void editDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Do you want to Edit details of person? Select y/n:");
		String check = sc.next();
			
		if(check.equalsIgnoreCase("y"))
		{
			while(true)
			{
				System.out.println("Enter the First Name of person whose details want to Edit:");
				String editName = sc.next();
				int pos = first_name.indexOf(editName);
				
				if(first_name.contains(editName))
				{	
					System.out.println();
				
					System.out.println("Enter the First Name: ");
					first_name.set(pos,sc.nextLine());
					System.out.println("Enter the Last Name: ");
					last_Name.set(pos,sc.nextLine());
					System.out.println("Enter the Address: ");
					address.set(pos,sc.nextLine());
					System.out.println("Enter the City: ");
					city.set(pos,sc.nextLine());
					System.out.println("Enter the State:");
					state.set(pos,sc.nextLine());
					System.out.println("Enter the Zip Code: ");
					zip.set(pos,sc.nextLine());
					System.out.println("Enter the Phone Number: ");
					phone.set(pos,sc.nextLine());
					System.out.println("Enter the Email address: ");
					email.set(pos,sc.nextLine());
					break;
				}
				else
					System.out.println("Name not found");
			}
		}
		else if(check.equalsIgnoreCase("n"))
		{
			System.out.println("You Selected 'NO'");
		}
		else
		{
			System.out.println("Invalid option. Choose correct: ");
			editDetails();
		}
		System.out.println("Firs_name: " +first_name+ " \nlast_name: "+last_Name+ "\nAddress: "+address+ " \ncity: "+city+
				"\nstate: "+state+ "\nzipcode: "+zip+ "\nPhoneNumber: "+phone+ "\nEmail: " +email);
	
	
	}
	
	//delete the details of persons from address book
	public void deleteDetails()
	{
		Scanner delete = new Scanner(System.in);
		System.out.println("Do you want to delete the details ? Select y/n ");
		String check = delete.next();
		
		if(check.equalsIgnoreCase("y"))
		{
			System.out.print("Enter the First name of person whose details want to delete ");
			String deleteName = delete.next();
			int pos = first_name.indexOf(deleteName);
			
			if(first_name.contains(deleteName))
			{
				first_name.remove(pos);
				last_Name.remove(pos);
				address.remove(pos);
				city.remove(pos);
				state.remove(pos);
				zip.remove(pos);
				phone.remove(pos);
				email.remove(pos);
			}
			
			System.out.println("Successfully delete details of " +deleteName);
			
		}
		else if (check.equalsIgnoreCase("n"))
			System.out.println("You Selected 'NO' ");
		else
			System.out.println("Invalid option");
			
	}
	
	public static boolean checkDuplicate(String personName){
		if(first_name.contains(personName))
			return true;
		else
			return false;
		
	}
	
	
	
	public static void main(String[] args){
		
		AddressBook AddressBook1 = new AddressBook();
		AddressBook AddressBook2 = new AddressBook();
	
		multipleBooks.put("AddressBook1",AddressBook1);
		multipleBooks.put("AddressBook2",AddressBook2);
		
		
		setMultipleBook();

	}
	
	
	
}
