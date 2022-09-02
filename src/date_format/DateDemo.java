package date_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat sd = new  SimpleDateFormat("dd/MM/YYYY hh:mm:ss");

		System.out.println(d);
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));




		

	}

}
