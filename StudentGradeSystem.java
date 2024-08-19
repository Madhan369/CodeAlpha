// Student Grade System Using Array
package com.CodeAlpha.SGT;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeSystem 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> grades = new ArrayList<>();
	        
	        System.out.println("Enter the grades for the students (enter -1 to stop):");
	        while (true) {
	            int grade = scanner.nextInt();
	            if (grade == -1) break;
	            grades.add(grade);
	        }

	        if (grades.size() > 0) {
	            int total = 0;
	            int highest = grades.get(0);
	            int lowest = grades.get(0);

	            for (int grade : grades) {
	                total += grade;
	                if (grade > highest) highest = grade;
	                if (grade < lowest) lowest = grade;
	            }

	            double average = (double) total / grades.size();

	            System.out.println("Average grade: " + average);
	            System.out.println("Highest grade: " + highest);
	            System.out.println("Lowest grade: " + lowest);
	        } 
		else {
	            System.out.println("No grades were entered.");
	        }
	}
}
