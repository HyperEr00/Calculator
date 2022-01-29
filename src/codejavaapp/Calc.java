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
    }
    
    public String doCalc() {
        if (operations == "-") {
            total = firstNumber - secondNumber;
        } else if (operations == "+") {
            total = firstNumber + secondNumber;
        } else if (operations == "/") {
            total = firstNumber / secondNumber;
        } else if (operations == "*") {
            total = firstNumber * secondNumber;
        } else {
        }
        if ((total%1) != 0){
        total = (double)Math.round(total * 100d) /100d;
        expression = Double.toString(total);
        return expression;
        } else {
            expression = Integer.toString((int) total);
            return expression;
        }
    }
}
