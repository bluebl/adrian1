package tryout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;

//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.commons;

public class tryout {

	public static void main(String[] args) {
		//Random 8 chars string Alphanumeric 
	      System.out.print("1) 8 char Alphanumeric string >>> ");
	     System.out.println(RandomStringUtils.randomAlphanumeric(8));
	     System.out.print("2) 8 char Alpha string >>> ");
	     System.out.println(RandomStringUtils.randomAlphabetic(8));
	     System.out.print("3) 40 char Alpha string >>> ");
	     System.out.println(RandomStringUtils.randomAscii(40));
	     System.out.print("4) toprow string >>> ");
	     System.out.println(RandomStringUtils.random(4, "!£$%^&*()"));
	     System.out.print("5)  string x >>> ");
	     char c[] = "X@X.com".toCharArray();
	     System.out.println(RandomStringUtils.random(8, c));
	     
	     
	     Calendar cal = Calendar.getInstance();
	      // You cannot use Date class to extract individual Date fields
	      int year = cal.get(Calendar.YEAR);
	      int month = cal.get(Calendar.MONTH);      // 0 to 11
	      int day = cal.get(Calendar.DAY_OF_MONTH);
	   
	      System.out.printf("Now is %02d/%02d/%4d\n",  // Pad with zero
	    		  day, month+1, year);
	      
	      Date now = new Date();
	      SimpleDateFormat simpleFormatterx = new SimpleDateFormat("dd/MM/yyyy ");
	      String x = simpleFormatterx.format(now).trim();
	      System.out.println("zyyxxfeature2--"+x+"--feature2zyxxy");
	     
	}

}
