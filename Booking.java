package Busrev;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String PassengerName;
	int BusNo;
	Date date;
	Scanner scan = new Scanner(System.in);
Booking(){
	System.out.println("Enter your Name:");
	PassengerName=scan.next();
	System.out.println("Enter Bus no:");
	BusNo=scan.nextInt();
	System.out.println("Enter Date dd-mm-yyyy:");
	String dateInput=scan.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	try {
		date= dateFormat.parse(dateInput);
	}
	catch (ParseException e) {
		e.printStackTrace();
	}}
public boolean isAvailable(ArrayList<Booking> bookbus,ArrayList<Bus> buses)
{
	int capacity =0;
	for(Bus b:buses) {
		if(b.getBusno()== BusNo) {
			capacity=b.getCapacity();
		}}
		int booked=0;
		for(Booking bb:bookbus) {
			if(bb.BusNo == BusNo && bb.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity;
			
	}
public void add(ArrayList<Booking> bookings) {
	bookings.add(this)
;}
}

