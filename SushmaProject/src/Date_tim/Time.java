package Date_tim;

import java.util.Date;

public class Time {

	public static void main(String[] args) {
		Date d = new Date();
		//System.out.print(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		String Time = d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
		System.out.println(Time);
		String date = d.getDate()+"/"+d.getMonth()+"/"+d.getYear();
		System.out.println(date);
	}
}