package allbookings;

import booking.Booking;
import customer.Customer;
import register.Register;

public class Allbookings {
	int j;
public void roomBooking(int startdate,int enddate,Customer customer,Register register,Booking booking) {
	for(int i=0;i<25;i++) {
	System.out.println(customer.datearray[j]);}
System.out.println("Customer id:\tRoom no:");
	for(int i=startdate;i<=enddate;i++) {
		for(j=1;j<=10;j++) {
		if(customer.datearray[j]==i) {
			if(booking.roomno[j]!=0)
			{
			if(register.registerno[j]!=0) {
				System.out.println(register.registerno[j]+"\t"+booking.roomno[j]);
			}
				
		}
	}
}
}
}
}

