package test.java.example;

public class Flight implements Comparable<Flight> {
	String FlightCityName;
	int FlightNumber;
	int FlightPrice;
	int FlightDistance;
	float FlightDiscount;

	public Flight() {
		System.out.println("Empty constructor is called");
	}

	public Flight(String flightCityName, int flightNumber, int flightPrice, int flightDistance, float flightDiscount) {
		FlightCityName = flightCityName;
		FlightNumber = flightNumber;
		FlightPrice = flightPrice;
		FlightDistance = flightDistance;
		FlightDiscount = flightDiscount;
	}

	public String getFlightCityName() {
		return FlightCityName;
	}

	public void setFlightCityName(String flightCityName) {
		FlightCityName = flightCityName;
	}

	public float getFlightDiscount() {
		return FlightDiscount;
	}

	public void setFlightDiscount(Float flightDiscount) {
		FlightDiscount = flightDiscount;
	}

	public int getFlightNumber() {
		return FlightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		FlightNumber = flightNumber;
	}

	public int getFlightPrice() {
		return FlightPrice;
	}

	public void setFlightPrice(int flightPrice) {
		FlightPrice = flightPrice;
	}

	public int getFlightDistance() {
		return FlightDistance;
	}

	public void setFlightDistance(int flightDistance) {
		FlightDistance = flightDistance;
	}

	@Override
	public int compareTo(Flight compareCity) {
		// this method is used to sort the arraylist of FlightObject

		int compareInt = this.FlightCityName.compareTo(compareCity.FlightCityName);
		if (compareInt < 0) {
			return -1;
		}
		if (compareInt > 0)
			return 1;
		else
		return 0;
	}

	public String toString() {
		return "City Name: " + FlightCityName + "\t\t" + "Flight Number: " + FlightNumber + "\t\t" + "Flight Price: "
				+ FlightPrice + "\t\t" + "FlightDistance: " + FlightDistance + "\t" + "FlightDiscount: "
				+ FlightDiscount + "\t";
	}

}