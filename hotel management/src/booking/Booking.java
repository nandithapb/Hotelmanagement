package booking;

import customer.Customer;

public class Booking {
	 int amount=0;
	int acd=1,acs=7,nacd=13,nacs=25;
	static int i=1;
	int booked[]=new int[25];
	public static int roomno[]=new int[25];
	//int roomno=1;
	Customer customer=new Customer();
	public void roomBooking(String ac,String cot, String cable,String wifi,String laundry) {
		customer.setAc(ac);
		customer.setCot(cot);
		customer.setCable(cable);
		customer.setWifi(wifi);
		customer.setLaundry(laundry);
		}
	
	public void total() {
		amount=0;
			if(customer.getAc().equalsIgnoreCase("AC")) {
			amount=amount+1000;
			}
			else if(customer.getAc().equalsIgnoreCase("nAC")){
				amount=amount+750;
			}
			if(customer.getCot().equalsIgnoreCase("Double")){
				amount=amount+350;
			}
			if(customer.getCable().equalsIgnoreCase("c")){
				amount=amount+50;
			}
			if(customer.getWifi().equalsIgnoreCase("w")){
				amount=amount+200;
			}
			if(customer.getLaundry().equalsIgnoreCase("l")){
				amount=amount+50;
			}
			System.out.println("The total charge is Rs. "+amount);
	}
		public void display() {
		System.out.println("The services chosen are\n");
		if(customer.getAc().equalsIgnoreCase("AC") && customer.getCot().equalsIgnoreCase("Double")) {
		System.out.println("Double cot AC room");
		}
		else if(customer.getAc().equalsIgnoreCase("AC") && customer.getCot().equalsIgnoreCase("Single")) {
			System.out.println("Single cot AC room");
		}
		else if(customer.getAc().equalsIgnoreCase("nAC") && customer.getCot().equalsIgnoreCase("Double") ){
			System.out.println("Double cot non AC room");
			}
		else if(customer.getAc().equalsIgnoreCase("nAC") && customer.getCot().equalsIgnoreCase("Single") ){
		System.out.println("Single cot non AC room");
		}
		if(customer.getCable().equalsIgnoreCase("c")){
			System.out.println("Cable connection enabled");
		}
		else { System.out.println("Cable connection is not enabled");
		}
		if(customer.getWifi().equalsIgnoreCase("w")){
			System.out.println("Wi-Fi enabled"); }
		else { System.out.println("Wi-Fi is not enabled"); }
		if(customer.getLaundry().equalsIgnoreCase("l")){
			System.out.println("with laundry service");}
		else { System.out.println("without laundry service"); }
			
	}
		  /* public void roomNo() {
					if(customer.getAc().equalsIgnoreCase("AC") && customer.getCot().equalsIgnoreCase("Double")) {
					roomno[i]=acd;
					i++;
					booked[acd]=1;
					acd++;
					
					}
					else if(customer.getAc().equalsIgnoreCase("AC") && customer.getCot().equalsIgnoreCase("Single")) {
						roomno[i]=acs;
						i++;
						booked[acs]=1;
						acs++;
					}
					else if(customer.getAc().equalsIgnoreCase("nAC") && customer.getCot().equalsIgnoreCase("Double") ){
						roomno[i]=nacd;
						i++;
						booked[nacd]=1;
						nacd++;
						}
					else if(customer.getAc().equalsIgnoreCase("nAC") && customer.getCot().equalsIgnoreCase("Single") ){
						roomno[i]=nacs;
						i++;
						booked[nacs]=1;
						nacs++;
					}
		}
		*/public void displayRoomNo(int roomno) {
				    System.out.println("thankyou for booking. Your room number is :"+roomno);	
				    
		}
}