package com.xworkz.aeroplane.flight;

public class FlightBookingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FlightBooking flight=new FlightBooking("Ae001","AeroCraft","Hubli",1000);
   flight.setAeroPlaneCode("code is: nm123");
   flight.setCompanyName("name is:AeroCraft");
   flight.setStartingPoint("starting at:hubli");
   flight.setBusinessClassPrice(1200);
System.out.println(flight.getAeroPlaneCode());
System.out.println(flight.getBusinessClassPrice());

System.out.println(flight.getCompanyName());
System.out.println(flight.getStartingPoint());

FlightBooking.search("Banglore");






	}

}
