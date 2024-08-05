package Collectorsdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {
public static void main(String[] args) {
	LocalDate date =LocalDate.now();// LocalDate is a class getting date by  LocalDate.now() then stored it in date reference
	System.out.println(date);
	
	LocalTime time=LocalTime.now();
	System.out.println(time);
	
	LocalDateTime dt = LocalDateTime.now();
	System.out.println(dt);
	
	
	//---------------------Date methods------------------------------------
	
	
	int dd=date.getDayOfMonth();
	int dy =date.getDayOfYear();
	int ddvalue =date.getMonthValue();
	
	System.out.println("Day of month =" +dd +"Day of year=" + dy +" Month of current year"+ ddvalue);
	
	
	//------------------Time methods------------------------
	
	int hh=time.getHour();
	int mm =time.getMinute();
	int ss=time.getSecond();
	int nn =time.getNano();
	
	System.out.println("Hour :"+hh+"  Minutes :"+mm+" : Sec :"+ss+"  NanoSec :"+nn );
	
	//-------------------Zone---------------------------
	
	
ZoneId zone=ZoneId.systemDefault();
System.out.println(zone);
ZoneId zone1=ZoneId.of("America/Los_Angeles");
System.out.println(zone1);
ZonedDateTime  zone2=ZonedDateTime.now(zone1);
System.out.println(zone2);
LocalDate date1=LocalDate.of(2000, 01, 10);

System.out.println(date1.plusWeeks(20));
LocalDate birthday=LocalDate.of(1997,Month.FEBRUARY, 28);

Period per=Period.between(birthday, LocalDate.now());

System.out.println(per.getDays() + " "+per.getMonths() + " "+per.getYears());

Year y=Year.of(2024);

if(y.isLeap()) {
	
	System.out.println("It is leap year");
	
}

else {
	
	System.out.println("It is not a leap year");
	
}



	
}
}
