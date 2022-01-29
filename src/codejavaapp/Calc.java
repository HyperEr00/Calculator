/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejavaapp;

/**
 *
 * @author Hyperer
 */
public class Calc {
    double firstNumber;
    double secondNumber;
    double total;
    String operations;
    String expression = "";

    public Calc(double firstNumber, double secondNumber, String operations) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operations = operations;
        System.out.println("calc object");
        System.out.println(this.firstNumber);
        System.out.println(this.secondNumber);
        System.out.println(this.operations);
    }
    
    public String doCalc() {
        if (operations == "-") {
            total = firstNumber - secondNumber;
            expression = Double.toString(total);
            return expression;
        } else if (operations == "+") {
            total = firstNumber + secondNumber;
            expression = Double.toString(total);
            return expression;
        } else if (operations == "/") {
            total = firstNumber / secondNumber;
            expression = Double.toString(total);
            return expression;
        } else if (operations == "*") {
            total = firstNumber * secondNumber;
            System.out.println(total);
            expression = Double.toString(total);
            return expression;
        } else {
            return expression;
        }
    }

    
    
    
    
    
}
