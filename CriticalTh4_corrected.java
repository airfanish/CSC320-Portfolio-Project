package Corrections;

import java.util.Scanner;

public class CriticalTh4_corrected {

	public static void main(String[] args) {
		
		double avgGrade;
		double maxGrade = 0;
		double minGrade = 0;
		double sum = 0;
		double grade;
		int i;
		
		Scanner scnr = new Scanner(System.in);
		
		//Corrections:
		// - Added validation to ensure only numeric grade values are entered
		// - improved prompt clarity
		
		System.out.println("Grade Statistics Calculator");
		for (i = 0; i < 10; i++) {
			System.out.println("Enter grade #" + (i + 1) + ": ");
			
			if (!scnr.hasNextDouble()) {
		        System.out.println("Error: Invalid input. Numeric grade required.");
		        scnr.close();
		        return;
			}
			
			grade = scnr.nextDouble();
			sum = sum + grade;
			
			if (i == 0) {
				maxGrade = grade;
				minGrade = grade;
			}
			else {
				if (grade > maxGrade) {
					maxGrade = grade;
				}
				if (grade < minGrade ) {
					minGrade = grade;
				}
			}
		}
		
avgGrade = sum / 10;

System.out.println("Grade Summary");
System.out.println("Average Grade: " + avgGrade);
System.out.println("Maximum Grade: " + maxGrade);
System.out.println("Minimum Grade: " + minGrade);

scnr.close();
	}
}
