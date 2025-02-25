package com.test.contacts;

public class Contactapp {
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	
	public Contactapp(String contactId, String firstName, String lastName, String address, String phone) {
		if (firstName == null || firstName.length() > 10)
			throw new IllegalArgumentException("Invalid first name, must be less than 10 char");
		
		if (lastName == null || lastName.length() > 10)
			throw new IllegalArgumentException("Your last name must be shorter than 10 char");
		
		if (contactId == null || contactId.length() > 10)
			throw new IllegalArgumentException("Invalid contact ID length, must be less than 10 char");
		
		if (phone == null || phone.length() != 10)
			throw new IllegalArgumentException("phone number must be 10 numbers.");
		if (address == null || address.length() > 30)
			throw new IllegalArgumentException("Your address cannot be greater than 30 char");
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	public String getcontactId() {
		return contactId;
	}
	public String getphone () {
		return phone;
	}
	
	public String getaddress() {
		return address;
	}
	public void setfirstName(String firstName) {
		        if (firstName == null || firstName.length() > 10) {
		            throw new IllegalArgumentException("Invalid first name");
		        }
		        this.firstName = firstName;
		    }

	    public void setlastName(String lastName) {
		        if (lastName == null || lastName.length() > 10) {
		            throw new IllegalArgumentException("Invalid last name");
		        }
		        this.lastName = lastName;
		    }

		 public void setphone(String phone) {
		        if (phone == null || phone.length() != 10) {
		            throw new IllegalArgumentException("Invalid phone number");
		        }
		        this.phone = phone;
		    }

		 public void setaddress(String address) {
		        if (address == null || address.length() > 30) {
		            throw new IllegalArgumentException("Invalid address");
		        }
		        this.address = address;
		    }
	
}

