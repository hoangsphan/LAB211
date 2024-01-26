/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

/**
 *
 * @author macbookpro
 */
import Model.EquationModel;
import View.EquationView;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EquationModel model = new EquationModel();
        EquationView view = new EquationView();
        EquationController controller = new EquationController(model, view, scanner);

        controller.run();
    }
}
