package customer;

public class Customer {
	private String firstname,middlename,lastname;
	private String address;
	private String contact;
	private String email;
	private String prooftype;
	private String proofid;
	public String emailarray[]=new String[25];
//	public String namearray[]=new String[25];
	int i=1;
	//getters and setters
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		emailarray[i]=email;
		i++;
		this.email = email;
		this.email = email;
	}
	public String getProoftype() {
		return prooftype;
	}
	public void setProoftype(String prooftype) {
		this.prooftype = prooftype;
	}
	public String getProofid() {
		return proofid;
	}
	public void setProofid(String proofid) {
		this.proofid = proofid;
	}

//booking.......
private int date;
private String ac;
private String cot;
private String cable;
private String wifi;
private String laundry;
static public int datearray[]=new int[50];
static int dateindex=0;
// getters and Setters

public String getAc() {
	return ac;
}
public void setAc(String ac) {
	this.ac = ac;
}
public String getCot() {
	return cot;
}
public void setCot(String cot) {
	this.cot = cot;
}
public String getCable() {
	return cable;
}
public void setCable(String cable) {
	this.cable = cable;
}
public String getWifi() {
	return wifi;
}
public void setWifi(String wifi) {
	this.wifi = wifi;
}
public String getLaundry() {
	return laundry;
}
public void setLaundry(String laundry) {
	this.laundry = laundry;
}
// check status.................
private int checkroomno;
// getters and setters
public int getCheckroomno() {
	return checkroomno;
}
public void setCheckroomno(int checkroomno) {
	this.checkroomno = checkroomno;
}
//email
private int customerid;
private String newemail;

public String getNewemail() {
	return newemail;
}
public void setNewemail(String newemail) {
	this.newemail = newemail;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
}

