package important;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import OOPSCONCEPT.Country;

public  class DateAndTime {

	public static void main(String[] args) {
		
			
			DateTimeFormatter a = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalTime lt = LocalTime.now();
			String time = lt.format(a);
			System.out.println(time);
			
			DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy:MM:dd");
			LocalDate ld = LocalDate.now();
			String date = ld.format(b);
			System.out.println(date);
	

		}
	


}