package test.java.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Scanner;

public class JavaDate_API {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		//System.out.println(date);

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();

		// System.out.printf("%d/%d/%d", dd,mm,yyyy);

		LocalTime lt = LocalTime.now();
		// System.out.println(lt);

		LocalDateTime dt = LocalDateTime.now();
	//	System.out.println(dt);
		int d=dt.getDayOfMonth();
		int mo=dt.getMonthValue();
		int yyy=dt.getYear();
		int h=dt.getHour();
		int min=dt.getMinute();
		int sec=dt.getSecond();
		int nano=dt.getNano();
		//System.out.printf("%d/%d/%d->%d:%d:%d:%d", d,mo,yyy,h,min,sec,nano);
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Leap year :");
		int in;
		
		while(true){
			if(sc.hasNextInt()){
			in	=sc.nextInt();
			Year y=Year.of(in);
			
			if(y.isLeap()){
				System.out.println(y+" is leap year....");
				break;
			}else {
				System.out.println(y+" is not leap year...");
				System.out.println("U entered wron year"+y+"Please enter valid year..");
				System.out.print("Enter Leap year :");
			//sc.next();
			}
			}
			
		}
		
	}

}
