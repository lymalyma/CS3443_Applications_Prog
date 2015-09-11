package lab2;

import java.util.Arrays;
/**
 * Grades object contains the name of each student and 
 * an array of their grades. 
 * @author Lymari Montijo
 *
 */
public class Grades {
	
	private String name; //name of student 
	private int[] grades; //array of student grades 
	
	/** 
	 * This is the object constructor
	 * 
	 * @param name stores the name of the student 
	 * @param gradesArray is the array that stores the student's grades
	 */
	public Grades(String name, int[] gradesArray) {
		this.grades = gradesArray; 
		this.name = name; 
	}
	
	
	public String getName() {
		return name; 
	}
	
	public int length() {
		return grades.length;  // does this return the length of the array? 
	}
	
	/** 
	 * Average Method
	 * @return returns the Average of the students grades 
	 */
	public double average() {
		if (grades.length == 0) {
			return 0; 
			
		}
		
		int sum = 0; 
		for( int grade : grades) {
			sum += grade; 
		}
		
		return (sum / grades.length);
	}
	
	/** 
	 * Minimum grade method
	 * @return returns the minimum of the grades
	 */
	
	public int minimum() {
		int minGrade = grades[0]; //the first element on the array
		for (int grade: grades) {
			if (grade < minGrade ) {
				minGrade = grade; 
			}
		}
		return minGrade; 
	}

	/**
	 * Maximum grade Method
	 * @return Returns the Maximum grade
	 */
	public int maximum() {
		int max = grades[0]; 
		for(int grade: grades) {
			if(max < grade) {
				max = grade; 
			}
		}
		return max;
	}

	/**
	 * Median Method
	 * @return returns the middle value of the grades
	 */
	public double median() {
		//sort the grades array
		if (grades.length == 0) {
			return 0.0; 
		}
		
		int[] gradesCopy = Arrays.copyOf(grades, grades.length); 
		Arrays.sort(gradesCopy);
		double median; 
		if (gradesCopy.length % 2 == 0) {
			int first = (gradesCopy.length - 1) / 2;
			int second = first + 1;
			
			median = (gradesCopy[first] + gradesCopy[second]) / 2.0;

		} else {
			
			int middle = (gradesCopy.length - 1) / 2;
			median = gradesCopy[middle];		
		}
		
		return median; 
	}
	
	@Override
	public String toString() {
		String output = this.name;
		output += " "; 
		output += Arrays.toString(grades); 
		
		return output; 
		
	}
		
	
	


}
