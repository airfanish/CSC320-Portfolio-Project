package Corrections;

import java.util.Scanner;
import java.util.ArrayList;

public class CriticalTh5_corrected {

	public static void main(String[] args) {
		
		ArrayList<String> weekDays = new ArrayList<String>();
        ArrayList<Double> temps = new ArrayList<Double>();
        String userInput = "";
        double sum = 0;
        double weeklyAvg;
        boolean found;

        Scanner scnr = new Scanner(System.in);
        
        //Corrections:
        // - Added validation to ensure only numeric temperature values are entered
        // - Made day-of-week matching case-insensitive (ex: "monday" = "MONDAY")

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println("Get Weekly Temperatures");
        int i;
        for (i = 0; i < weekDays.size(); ++i) {
            System.out.print("Enter temperature for " + weekDays.get(i) + ": ");
            
            if (!scnr.hasNextDouble()) {
                System.out.println("Error: Invalid input. Numeric temperature required.");
                scnr.close();
                return;
            }
            
            double temperature = scnr.nextDouble();
            temps.add(temperature);
        }

        while (true) {
            System.out.print("Enter a day of the week, type 'week', or type 'exit': ");
            userInput = scnr.next();

            if (userInput.equals("exit")) {
                break;
            }
                     
            if (userInput.equalsIgnoreCase("week")) {
                sum = 0;
                for (i = 0; i < weekDays.size(); ++i) {
                    System.out.println(weekDays.get(i) + ": " + temps.get(i));
                    sum = sum + temps.get(i);
                }
                weeklyAvg = sum / temps.size();
                System.out.println("Weekly average: " + weeklyAvg);
            }
            else {
                found = false;
                
                for (i = 0; i < weekDays.size(); ++i) {
                    if (userInput.equalsIgnoreCase(weekDays.get(i))) {
                        System.out.println(weekDays.get(i) + ": " + temps.get(i));
                        found = true;
                    }
                }
                
                if (!found) {
                    System.out.println("Invalid Input");
                }
            }
        }

        scnr.close();

	}
}
