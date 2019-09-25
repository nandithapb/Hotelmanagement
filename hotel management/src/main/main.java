package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import allbookings.Allbookings;
import booking.Booking;
import customer.Customer;
//import email.Email;
import register.Register;
public class main {
	public static void main(String args[]) throws IOException
	{
		String yes1;
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int choice,index=0,roomno=1;
		int roomNo;
		int customerid;
		String newemail;
		
		int startdate,enddate;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//objects
		Customer cu=new Customer();
		Register register=new Register();
		Booking booking=new Booking();
		Allbookings allbookings=new Allbookings();
		do//for menu
		{
		System.out.println("\n\tMENU:\n1.Register\n2.Book\n3.Check Status\n4.Email\n5.All Bookings\n6.All Customer\n7.Exit\n\nChoose your option");
		choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1://for registration.....
		{
	    do//for registration
		{
		register.register();
		register.display();
		System.out.println("Do you want to continue(y/n)?");
		yes1=br.readLine();
		}while(yes1.equalsIgnoreCase("n"));
	    break;
		}
	    case 2:
	    {
			System.out.println("\tBooking:\n");
			System.out.println("Please choose the services required");
			System.out.println("Enter the date of booking");
			Customer.datearray[index]=Integer.parseInt(br.readLine());
			System.out.println("AC/non-AC(AC/nAC)");
			ac=br.readLine();
			System.out.println("Cot(Single/Double)");
			cot=br.readLine();
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable=br.readLine();
			System.out.println("Wi-Fi needed or not(W/nW)");
			wifi=br.readLine();
			System.out.println("Laundry service needed or not(L/nL)");
			laundry=br.readLine();
			booking.roomBooking(ac, cot, cable, wifi, laundry);
			booking.total();
			Booking.roomno[index]=roomno;
			booking.display();
			booking.displayRoomNo(roomno);
			index++;
			roomno++;
			break;
		}
		case 3://for check status
		{
			System.out.println("\tCheck Status");
			System.out.println("Enter the room number:");
		    roomNo = Integer.parseInt(br.readLine());
		    int flag=0;
			for(int i=0;i<=25;i++) {
				if(booking.roomno[i]==roomNo) {
					flag=1;
					break;
				}
				}
				if(flag==1) {
					System.out.println("Room number "+roomNo+" is  booked");
				}
				else {
					System.out.println("Room number "+roomNo+" is  not booked");
				}
				
		    break;
		}
		case 4://to update email
		{
			System.out.println("\t Email Updation");
			System.out.println("Enter the Customer ID");
			customerid=Integer.parseInt(br.readLine());
			for(int i=0;i<20;i++)
			{
				if(customerid==register.registerno[i])
				{
			System.out.println("Enter the new email ID");
			newemail=br.readLine();
			cu.emailarray[i]=newemail;
			System.out.println("updated email id is :"+cu.emailarray[i]);
			System.out.println("\temail updated");
			
				}
		}
			break;
			}
		case 5://to view all bookings
		{
			System.out.println("\t All Bookings");
			System.out.println("Enter the start date");
			startdate=Integer.parseInt(br.readLine());
			System.out.println("Enter the end date");
			enddate=Integer.parseInt(br.readLine());
			System.out.println("customer ID\tRoom number");
			for(int i=0;i<20;i++)
			{
				if((cu.datearray[i]>=startdate)&&(cu.datearray[i]<=enddate))
				{
					
					System.out.println(register.registerno[i]+"  "+booking.roomno[i]);
			}}
			break;
		}
		case 6://all customers
		{
		System.out.println("\tAll Customers:");	
		System.out.println("Registered Customers are:");
		System.out.println("Customer ID\tCustomer Name");
		for(int i=0;i<20;i++) {
			System.out.println(register.registerno[i]+"\t\t"+register.name[i]);
		}
		break;
		}
		case 7:
		{
			for(int i=0;i<=20;i++)
			{
				System.out.println(cu.datearray[i]+"\t"+register.registerno[i]+"\t"+register.email[i]+"\t"+register.name[i]);
			}
			break;
		}
		}
		}while(true);
		
	}
}
