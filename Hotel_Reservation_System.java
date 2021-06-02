
import java.util.Scanner;
import java.util.stream.Stream;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

class A
{
	public String fName,lName;
	public String Address,email,contact;
	public String roomNo,amount;
	public Scanner sc = new Scanner(System.in);
	
	public List<Person> info = new ArrayList<Person>();
	public String getUserInput()
	{
		System.out.println("Enter first and last name:");
		fName = sc.next();
		lName = sc.next();
		System.out.println("Enter your address:");
		Address = sc.next();
		System.out.println("Enter your email_Id:");
		email = sc.next();
		System.out.println("Enter your contact number:");
		contact = sc.next();
		System.out.println("Enter room number u want to rent :");
		roomNo = sc.next();
		System.out.println("Enter prize of the room:");
		amount = sc.next();

		Person p = new Person();
		p.setfName(fName);
		p.setlName(lName);
		p.setAddress(Address);
		p.setEmail(email);
		p.setContact(contact);
		p.setRoomNo(roomNo);
		p.setAmount(amount);
		
		info.add(p);
	
		System.out.println("Do you want to book any other room in the hotel(Y/N):");
		return sc.next();
	}
}

class B extends A
{
	public void showData()
	{
		System.out.println("Number of records: " + info.size());
		
		System.out.println("Hotel room booked customer details:");
		info.stream().forEach(fname -> System.out.println("First Name - " + fname.getfName()));
		info.stream().forEach(lname -> System.out.println("Last name - " + lname.getlName()));
		info.stream().forEach(addr -> System.out.println("Address - " + addr.getAddress()));
		info.stream().forEach(email -> System.out.println("Email - " + email.getEmail()));
		info.stream().forEach(contact -> System.out.println("Contact - " + contact.getContact()));
		info.stream().forEach(roomNum -> System.out.println("Room number - " + roomNum.getRoomNo()));
		info.stream().forEach(amount -> System.out.println("Amount ->" + amount.getAmount()));
	}

}


public class Hotel_Reservation_System 
{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Do you want to book any other room in the hotel(Y/N):");
		String reply = sc.next();
		
		B a1 = new B();
		
		while(reply.equalsIgnoreCase("Y"))
		{
			reply = a1.getUserInput();
		}
		
		
		System.out.println("Users record Details:");
		a1.showData();
		
	}
}
