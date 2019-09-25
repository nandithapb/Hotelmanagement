package booking;

public class SeasonBooking extends Booking {
	
	public void bookRoom(String month,int noOfPersons,int tariff, int days) {
		return super.bookRoom(noOfPerson, tariff, days)*2*tariff;
	}
	public void bookRoom(String month,int noOfPersons,int tariff, int days,int discount) {
		return super.bookRoom(noOfPerson, tariff, days)*discount;
	}
}
