package in.java.test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date1 {
public static void main(String[] args) {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
}
}
