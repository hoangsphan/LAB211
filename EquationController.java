/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.EquationModel;
import View.EquationView;
import java.util.Scanner;
public class EquationController {
    private EquationModel model;
    private EquationView view;
    private Scanner scanner;
    
    public EquationController(EquationModel model, EquationView view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
    }
    
    public void run() {
        int option;
        do {
            view.displayMenu();
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    calculateSuperlativeEquation();
                    break;
                case 2:
                    calculateQuadraticEquation();
                    break;
                case 3:
                    view.displayExitMessage();
                    break;
                default:
                    view.displayErrorMessage("Invalid option. Please try again.");
                    break;
            }
        } while (option != 3);
        
        scanner.close();
    }
    
    private void calculateSuperlativeEquation() {
        double[] coefficients = view.getCoefficientsFromUser();
        
        model.setCoefficients(coefficients[0], coefficients[1], 0);
        model.calculateSuperlativeEquation();
        
        double[] evenNumbers = model.getEvenNumbers();
        double[] oddNumbers = model.getOddNumbers();
        double[] squareNumbers = model.getSquareNumbers();
        
        view.displaySolution(model.getSolution());
        view.displayNumbers("Even", evenNumbers);
        view.displayNumbers("Odd", oddNumbers);
        view.displayNumbers("Square", squareNumbers);
    }
    
    private void calculateQuadraticEquation() {
        double[] coefficients = view.getCoefficientsFromUser();
        
        model.setCoefficients(coefficients[0], coefficients[1], coefficients[2]);
        model.calculateQuadraticEquation();
        
        double[] evenNumbers = model.getEvenNumbers();
        double[] oddNumbers = model.getOddNumbers();
        double[] squareNumbers = model.getSquareNumbers();
        
        view.displaySolutions(model.getSolution1(), model.getSolution2());
        view.displayNumbers("Even", evenNumbers);
        view.displayNumbers("Odd", oddNumbers);
        view.displayNumbers("Square", squareNumbers);
    }
}