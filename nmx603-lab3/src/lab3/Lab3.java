package lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 


public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Reading in the file/... */ 
		
		Scanner in = null;
		
		try {
		    in = new Scanner(new File("date.txt"));
		} catch (FileNotFoundException exception) {
		    System.err.println("failed to open dates.txt");
		    System.exit(1);
		}
		
		ArrayList<Date> datesStack = new ArrayList<Date>(); 
		
		while (in.hasNextLine()) {
			
		    String line = in.nextLine();
		    Date date = new Date(line);
		    datesStack.add(date); 
		  
		    System.out.println(date);
		    
		    if (datesStack.size() == 2) {
		    	Date date2 = datesStack.get(datesStack.size()-1)
		    }
		    // need more code for DateRange objects
		}    
		
	}

}
