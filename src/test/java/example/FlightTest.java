package test.java.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class FlightTest
{
	public static Scanner scanner= new Scanner(System.in);
	public static Flight flight;
	public static ArrayList<Flight> flightList;
	public static int flight_distance=0,flight_price=0,flight_number=0;
	public static float flight_discount=0;
	public static String flight_departure_city;
	
	public static void printdata()
	{
		int no_of_flights=0;
		System.out.println("Enter Number of flights data you want to store:");
		no_of_flights=scanner.nextInt();
		
		if(no_of_flights<8)
		{
			for(int i=0;i<no_of_flights;i++)
			{
			System.out.println("Enter Flight Departure City "+(i+1)+":");
			flight_departure_city=scanner.next();
			
			System.out.println("Enter flight number "+(i+1)+":");
			flight_number=scanner.nextInt();
			
			System.out.println("Enter flight distance "+(i+1)+":");
			flight_distance=scanner.nextInt();
			
			System.out.println("Enter flight price "+(i+1)+":");
			flight_price=scanner.nextInt();
			
			flight=new Flight(flight_departure_city,flight_number,flight_price,flight_distance,flight_discount);
			flightList.add(flight);
			
		}
		System.out.println("Flights data is stored successfully...Select any of the option in the menu to perform further actions");
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			menulist();

		}
		else
		{
		System.out.println("Enter Number below 8 only");
		}
		
		//System.out.println("Flight city is:"+flightList.getFlightCityName());			
	}
	
	public static void storeDiscounts()
	{
		System.out.println("Enter the discount number: ");
		int discountNumber=scanner.nextInt();
		for(int i=0;i<flightList.size();i++)
		{
		int flightPr=flightList.get(i).getFlightPrice();
		float discountedFlightPrice=flightPr-(flightPr*discountNumber)/100;
		
		flight_departure_city= flightList.get(i).getFlightCityName();
		flight_distance=flightList.get(i).getFlightDistance();
		flight_number= flightList.get(i).getFlightNumber();
		flight_price=flightList.get(i).getFlightPrice();
		
		//flightList.add(new Flight().setFlightDiscount(discountedFlightPrice));
		
		flight=new Flight(flight_departure_city,flight_number,flight_price,flight_distance,flight_discount);
		//flightList.add(flight);
		//flightList.add(flight);
		
	
		System.out.println("Discount is:"+discountedFlightPrice);
		}
		
			
		for(int i=0;i<flightList.size();i++)
		{
			System.out.println(flightList.get(i).getFlightCityName()+"\t\t\t"+flightList.get(i).getFlightNumber()+"\t\t\t"
			+flightList.get(i).getFlightDistance()+"\t\t\t"+flightList.get(i).getFlightPrice()+"\t\t\t"+flightList.get(i).getFlightDiscount());

		}
		System.out.println("------------------------------------------------------");
			System.out.println("\n");
		menulist();
	}
	
	public static void displayAllFlights()
	{
		System.out.println("You selected number 3"+"\n");
		System.out.println(flightList.size());
		System.out.println("Departure City Name"+"\t"+"Flight Number"+"\t"+
			"Flight Distance"+"\t"+"Flight Price"+"\n");
		for(int i=0;i<flightList.size();i++)
		{
			System.out.println(flightList.get(i).getFlightCityName()+"\t\t\t"+flightList.get(i).getFlightNumber()+"\t\t\t"+flightList.get(i).getFlightDistance()+"\t\t\t"+flightList.get(i).getFlightPrice()+"\t\t\t"+flightList.get(i).getFlightDiscount());

		}
		System.out.println("------------------------------------------------------");
			System.out.println("\n");
		menulist();
	}
	
	public static void searchFlightByNumber()
	{
		
		System.out.println("You selected number 4"+"\n");
		System.out.println("Enter the flight number to search:");
		flight_number=scanner.nextInt();
		for(int i=0;i<flightList.size();i++)
		{
			
			if(flightList.get(i).getFlightNumber()==flight_number)
			{
			System.out.println("Departure City Name"+"\t"+"Flight Number"+"\t"+
			"Flight Distance"+"\t\t\t"+"Flight Price"+"\n");
			System.out.println(flightList.get(i).getFlightCityName()+"\t\t\t"+flightList.get(i).getFlightNumber()+"\t\t\t"+flightList.get(i).getFlightDistance()+"\t\t\t"+flightList.get(i).getFlightPrice()+"\t\t\t"+flightList.get(i).getFlightDiscount());
			
			}
		}
		System.out.println("------------------------------------------------------");
			System.out.println("\n");
		menulist();
	}
	
	public static void flightsWithLowestRates()
	{
		//System.out.println("You selected number 5"+"\n");
		
		//Collections.sort(flightList,Flight.SalaryComparator());
		Collections.sort(flightList);
		System.out.println(
		"City Name: " + flightList.get(flightList.size()-1).getFlightCityName()+"\t\t"
		+"Flight Number: "+flightList.get(flightList.size()-1).getFlightNumber()+"\t\t"
		+"Flight Price: "+flightList.get(flightList.size()-1).getFlightPrice()+"\t\t"
		+"FlightDistance: "+flightList.get(flightList.size()-1).getFlightDistance()
		+"\t\t\t"+flightList.get(flightList.size()-1).getFlightDiscount());
		
		System.out.println("------------------------------------------------------");
		System.out.println("\n");
		menulist();
	}
	
	public static void sortAndDisplayFlights()
	{
		int i=0;
		
		Collections.sort(flightList,Collections.reverseOrder());
		System.out.println("Departure City Name"+"\t"+"Flight Number"+"\t"+
			"Flight Distance"+"\t\t\t"+"Flight Price"+"\n");
		for(Flight temp: flightList){
		  /* System.out.println("FlightNumber " + ++i + " : " + temp.getFlightNumber() + 
			", Flight Price : " + temp.getFlightPrice());*/
			System.out.println(temp.getFlightCityName()+"\t\t\t"+temp.getFlightNumber()+"\t\t\t"+temp.getFlightDistance()+"\t\t\t"
			+temp.getFlightPrice()+"\t\t\t"+temp.getFlightDiscount());
		}
		System.out.println("------------------------------------------------------");
			System.out.println("\n");
		menulist();
	}
	
	public static void exitApp()
	{
		System.out.println("Do you want to exit?? y/n");
		String yes_no=scanner.next();
		if(yes_no=="y")
		{
			System.exit(0);
		}
		
	}
	public static void menulist()
	{
		final int num_for_switch;
		System.out.println("1. Store flight Data"+"\n"+
	"2. Calculate and Store Discounts"+"\n"+"3. Display all Flights"+"\n"+
	"4. Search a flight by number"+"\n"+"5. Flight with lowest price"+"\n"+
	"6. Sort and display sorted flights"+"\n"+"7. Exit from the application"+"\n");
	
	System.out.println("Choose the number you want in the following menu:");
	num_for_switch=scanner.nextInt();
	
	//Flight flight=new Flight();
	
	switch(num_for_switch)
	{
		case 1:
		printdata();
		break;
		case 2:
		storeDiscounts();
		break;
		case 3:
		displayAllFlights();
		break;
		case 4:
		searchFlightByNumber();
		break;
		case 5:
		flightsWithLowestRates();
		break;
		case 6:
		sortAndDisplayFlights();
		break;
		case 7:
		
		exitApp();
		System.out.println("You are exited from the console... Have a good day");
		break;
		
		default:
		System.out.println("Enter number between 1-7 only");
	}

	}
	
	
public static void main(String...args)
{
	
	flightList=new ArrayList<>();
	
	flightList.add(new Flight("mani",1218,1200,2000,0.0f));
	flightList.add(new Flight("spice",123,1300,2000,0.0f));
	flightList.add(new Flight("Jet",111,1400,2000,0.0f));
	System.out.println("\n"+"Enter number between 1-7\n");
	
	/*System.out.println("1. Store flight Data"+"\n"+
	"2. Calculate and Store Discounts"+"\n"+"3. Display all Flights"+"\n"+
	"4. Search a flight by number"+"\n"+"5. Flight with lowest price"+"\n"+
	"6. Sort and display sorted flights"+"\n"+"7. Exit from the application"+"\n");*/
	menulist();
	
	
}
	
}