/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class EquationModel {
    private double a;
    private double b;
    private double c;
    private double x;
    private double x1;
    private double x2;
    
    public void setCoefficients(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void calculateSuperlativeEquation() {
        x = -b / a;
    }
    
    public void calculateQuadraticEquation() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }
    
    public double getSolution() {
        return x;
    }
    
    public double getSolution1() {
        return x1;
    }
    
    public double getSolution2() {
        return x2;
    }
    
    public double[] getCoefficients() {
        return new double[] {a, b, c};
    }
    
    public double[] getEvenNumbers() {
        int start = (int) Math.ceil(a);
        int end = (int) Math.floor(b);
        int size = (int) Math.floor((end - start) / 2) + 1;
        double[] evenNumbers = new double[size];
        
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers[index] = i;
                index++;
            }
        }
        
        return evenNumbers;
    }
    
    public double[] getOddNumbers() {
        int start = (int) Math.ceil(a);
        int end = (int) Math.floor(b);
        int size = (int) Math.ceil((end - start) / 2);
        double[] oddNumbers = new double[size];
        
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
                index++;
            }
        }
        
        return oddNumbers;
    }
    
    public double[] getSquareNumbers() {
        int start = (int) Math.ceil(a);
        int end = (int) Math.floor(b);
        int size = 0;
        
        for (int i = start; i <= end; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                size++;
            }
        }
        
        double[] squareNumbers = new double[size];
        
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                squareNumbers[index] = i;
                index++;
            }
        }
        
        return squareNumbers;
    }
}
