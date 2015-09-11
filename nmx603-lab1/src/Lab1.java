import java.util.Scanner; 
import java.io.File; 


/**
 * <h2>Program description:</h2> 
 * <p>This program reads the contents of a file 
 * and prints the number of tokens that are numbers, the number 
 * of tokens that are <em>NOT</em> tokens and the sum of the numbers.</p> 
 * @author Lymari Montijo 
 *
 */


public class Lab1 {
	/** 
	 * <p>The main method calls the scanner object to read from the data.txt file
	 * The variables num_count and not_num_count represent the numbers and non-number 
	 * tokens respectively. The variable sum keeps track of the sum of the number tokens. 
	 * At the end of parsing the file, the program prints out the expected output. 
	 *  </p>
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = null; 
		try {
			in = new Scanner(new File("data.txt"));
		} catch(Exception FileNotFoundException) {
			System.err.println("Failed to open data.txt"); 
			System.exit(1);
		}
	
		int num_count = 0; 
		int not_num_count = 0;
		double sum = 0.0; 
		
		while(in.hasNext()) {
			String token = in.next();
			if (new Scanner(token).hasNextDouble()) {
				num_count++; 
				double d = Double.parseDouble(token);
				sum = sum + d; 
			} else {
				not_num_count++; 
			}
		}
		
		
		System.out.println(num_count + " " + not_num_count + " " + String.format("%.2f", sum));
		
		
		in.close();
	}
	
}

