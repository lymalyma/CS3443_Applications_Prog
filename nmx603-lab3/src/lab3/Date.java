package lab3;
import java.util.*; 

public class Date implements Comparable<Date> {
	
	private String month; 
	private String date; 
	private int day; 
	private int year; 
	private int monthNum; 
	private boolean isValid = true; 
	
	private static String[] mnths = {"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"}; 	
		
	public Date(String date) {
		this.date = date; 
		/*decompose the string into month, date, year */ 
		String[] tokens = date.split(" ", 3); 
		month = tokens[0].toLowerCase().substring(0,3); 
		String[] dayTokens = tokens[1].split(","); 
		
		day = Integer.parseInt(dayTokens[0]); 
		year = Integer.parseInt(tokens[2]); 
		
	//To Do : Validate the dates: No neg years, valid months Strings, valid day ranges, leap years
	
	/*	public enum months {
			"jan", "feb", "mar", "apr", "may", "jun", 
			"jul", "aug", "sep", "oct", "nov", "dec"
		} */  
		
		switch (month) {
		case "jan": 
			monthNum = 1;
			break;
		case "feb":
			monthNum = 2;
			break;
		case "mar":
			monthNum = 3; 
			break;
		case "apr":
			monthNum = 4; 
		case "may":
			monthNum = 5; 
			break; 
		case "jun":
			monthNum = 6; 
			break; 
		case "jul":
			monthNum = 7; 
			break; 
		case "aug": 
			monthNum = 8; 
			break; 
		case "sep":
			monthNum = 9;
			break; 
		case "oct":
			monthNum = 10;
			break; 
		case "nov":
			monthNum = 11;
			break; 
		case "dec":
			monthNum = 12;
			break; 
		}
		
		
		
	}
			
	
	@Override
	public String toString() {
		
		String output = "Date : " + strMonth(monthNum); //strMonth takes in the int month and returns the String i.e "January" ???  
		output += " " + day + ", ";
		output += year; 
		
		return output; 
		
		//return "Invalid Date " 
	}
	
	/** 
	 * 
	 *
	 * @param The integer representing the month
	 * @return Returns the month in String form. 
	 */
	public String strMonth(int m) {	
		return mnths[m-1]; 
	}
	
	//so date right now is a raw string. We must have methods to parse lines, 
	//and interpret the months, dates, years,  etc. 

	
	

	@Override
	public int compareTo(Date nextDate) {
		if (this.year < nextDate.year) {
			return -1; 
		} else if (this.year > nextDate.year) {
			return 1; 
		} else if (this.monthNum < nextDate.monthNum) {
			return -1; 
		} else if (this.monthNum > nextDate.monthNum) {
			return 1; 
		} else if (this.day < nextDate.day) {
			return -1; 
		} else if (this.day > nextDate.day) {
			return 1; 
		}
		return 0;
	}
	
	
}
