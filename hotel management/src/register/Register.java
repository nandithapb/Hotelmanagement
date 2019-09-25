package register;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import customer.Customer;
public class Register {
	static public int registerno[]=new int[25];
	public static String [] email= new String[25];
	public static String [] name= new String[25];
	Customer cu = new Customer();
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	static int i=0;
	public void register() throws IOException {
		System.out.println("\tRegistration:\n\nEnter your first name");
		cu.setFirstname(br.readLine());
		System.out.println("Enter your middle name");
		cu.setMiddlename(br.readLine());
		System.out.println("Enter your last first name");
		cu.setLastname(br.readLine());
		System.out.println("Enter your address");
		cu.setAddress(br.readLine());
		System.out.println("Enter your contact");
		cu.setContact(br.readLine());
		System.out.println("Enter your email");
		cu.setEmail(br.readLine());
		System.out.println("Enter your prooftype");
		cu.setProoftype(br.readLine());
		System.out.println("Enter your proofid");
		cu.setProofid(br.readLine());
	}
	public void display() {
		System.out.println("NAME		:"+cu.getFirstname()+" "+cu.getMiddlename()+" "+cu.getLastname());
		System.out.println("ADDRESS		:"+cu.getAddress());
		System.out.println("CONTACT		:"+cu.getContact());
		System.out.println("EMAIL		:"+cu.getEmail());
		System.out.println("PROOF TYPE	:"+cu.getProoftype());
		System.out.println("PROOF ID	:"+cu.getProofid());	
		registerno[i]=i+1;
		email[i]=cu.getEmail();
		name[i]=cu.getFirstname();
		System.out.println("Thankyou for registering your id is "+(registerno[i])+"...");
		i++;
	}
	public void allCustomer() {
		
	}
}
