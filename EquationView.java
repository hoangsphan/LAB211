/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;

public class EquationView {
    
    public void displayMenu() {
        System.out.println("Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Please choose an option: ");
    }
    
    public double[] getCoefficientsFromUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        double a;
        while (!scanner.hasNextDouble()) {
            System.out.println("Please input a number");
            System.out.print("Enter A: ");
            scanner.next();
        }
        a = scanner.nextDouble();
        
        System.out.print("Enter B: ");
        double b;
        while (!scanner.hasNextDouble()) {
            System.out.println("Please input a number");
            System.out.print("Enter B: ");
            scanner.next();
        }
        b = scanner.nextDouble();
        
        System.out.print("Enter C: ");
        double c;
        while (!scanner.hasNextDouble()) {
            System.out.println("Please input a number");
            System.out.print("Enter C: ");
            scanner.next();
        }
        c = scanner.nextDouble();
        
        return new double[] {a, b, c};
    }
    
    public void displaySolution(double x) {
        System.out.println("Solution: x = " + x);
    }
    
    public void displaySolutions(double x1, double x2) {
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
    }
    
    public void displayNumbers(String label, double[] numbers) {
        System.out.print("Number is " + label + ": ");
        for (double number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
    
    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
    
    public void displayExitMessage() {
        System.out.println("Exiting the program...");
    }
}