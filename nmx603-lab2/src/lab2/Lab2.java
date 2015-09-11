package lab2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Lab2 {
	/**
	 * In the main method we read the file "data.txt" and read in 
	 * each name and store the grades in an array, which in turn get stored in a 
	 * Grades object using the Grades.java class. Then the testGrades method processes 
	 * each student's grades and prints it onto the console. 
	 * 
	 * @author Lymari Montijo
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Grades> students = new ArrayList<Grades>();
		Scanner in = null;
		try {
			in = new Scanner(new File("src/lab2/data.txt"));
		} catch (FileNotFoundException exception) {
			System.err.println("failed to open data.txt");
			System.exit(1);
		}
		
		while (in.hasNext()) {
			String name = in.next();
			ArrayList<Integer> gradesArray = new ArrayList<Integer>();
			while (in.hasNextInt()) {
				int grade = in.nextInt();
				gradesArray.add(grade);
			}

			int[] gradesArray2 = new int[gradesArray.size()]; 
			for (int i = 0; i < gradesArray2.length; i++) {
				gradesArray2[i] = gradesArray.get(i).intValue();

			}

			Grades studentGrade = new Grades(name, gradesArray2);
			students.add(studentGrade); 

		}

		for (Grades s : students) {
			testGrades(s);
			System.out.println();
		}

	}

	/** 
	 * Takes the grades objects and prints the information of each student
	 * @param grades
	 */
	public static void testGrades(Grades grades) {
		System.out.println(grades.toString());
		System.out.printf("\tName:    %s\n", grades.getName());
		System.out.printf("\tLength:  %d\n", grades.length());
		System.out.printf("\tAverage: %.2f\n", grades.average());
		System.out.printf("\tMedian:  %.1f\n", grades.median());
		System.out.printf("\tMaximum: %d\n", grades.maximum());
		System.out.printf("\tMininum: %d\n", grades.minimum());
	}

}
