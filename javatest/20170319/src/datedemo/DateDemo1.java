package datedemo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class DateDemo1 
{
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		GregorianCalendar now=new GregorianCalendar();
		System.out.println(now);
		
		DateFormat df1=null;
		df1=DateFormat.getDateInstance();
		System.out.println(df1);
		Random r=new Random();
		for(int i=0;i<10000;i++)
			
		System.out.println(r.nextInt(100));
		
	}
}
class DateTime
{
	private Calendar calendar=null;
	public DateTime()
	{
		this.calendar=new GregorianCalendar();
	}
}
