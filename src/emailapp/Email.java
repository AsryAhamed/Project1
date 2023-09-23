package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	//Constructor to receive the first name and last name
	public Email(String firstName , String lastNmae) {
		this.firstName = firstName;
		this.lastName = lastNmae;
		System.out.println("EMAIL CREATED: " + this.firstName + " "+ this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Deprtment: " + this.department);
		
		// call a method return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+ this.password);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "acct"; }
		else { return ""; }
		
		
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHTJKLMNOPQRSTUWXYZ0123456789!@#$%";
		char []password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random()* passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	
	// Change the password

}
