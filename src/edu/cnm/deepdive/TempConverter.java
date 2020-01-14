package edu.cnm.deepdive;

import java.util.*;
import java.lang.Math;

public class TempConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("Please enter a temperature in degrees Celsius.(Press <Enter> to quit.)");
            String userInput;
            double degreesCelsius;
            
            userInput = input.nextLine();
            if (userInput.length() > 0) {
                degreesCelsius = Double.parseDouble(userInput);
                System.out.print("The temperature is ");
                System.out.print(convertC2F(degreesCelsius));
                System.out.println(" in degrees Fahrenheit.");
            } else {
                repeat = false;
            }
        }
        System.out.println("Goodbye...");
    }
    
    public static double convertC2F(double degreesCelsius) {
        double degreesFahrenheit;
        
        degreesFahrenheit = (double) 9 / 5 * degreesCelsius + 32;
        
        return degreesFahrenheit;
    }
}
