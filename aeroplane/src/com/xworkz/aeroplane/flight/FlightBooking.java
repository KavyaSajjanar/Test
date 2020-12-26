package com.xworkz.aeroplane.flight;

public class FlightBooking {
	private String aeroPlaneCode;
	private String companyName;
	private  String startingPoint="banglore";
	private String destination;
	private int totalSeats;
	private String domestic;
	private int businessClassPrice;
	private int economyClassPrice;

	public FlightBooking(String aeroplaneCode, String companyName, String startingPoint,int businessClassPrice) {
		if (businessClassPrice >= 1000) {
			System.out.println("Can accept the booking");
		} else {
			System.out.println("cannot accept booikng, please enter valid amount");

		}
	}
	public static void search(String startingPoint) {
	
		if(startingPoint=="Banglore") {
			System.out.println("display details");
			
		}
		
		else {
			System.out.println("give correct starting point"); 
			
			
		}
	}
	
		
	
	
	public String getAeroPlaneCode() {
		return aeroPlaneCode;
	}

	public void setAeroPlaneCode(String aeroPlaneCode) {
		this.aeroPlaneCode = aeroPlaneCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getDomestic() {
		return domestic;
	}

	public void setDomestic(String domestic) {
		this.domestic = domestic;
	}

	public double getBusinessClassPrice() {
		return businessClassPrice;
	}

	public void setBusinessClassPrice(int businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}

	public int getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(int economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
}