/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arithmeticmethods;

/**
 *
 * @author lab_services_student
 */


/*
    Create class Operator with methods for (+, -, *, /, %)
    Create method printMessage()
    Prompt user for 2 int vals
    Invoke methods and display results
*/

public class ArithmeticMethods {
//SEE OPERATORS class for different implementation approaches
    public static void main(String[] args) {
     Operators op = new Operators();
     
     System.out.println(op.summation(5, 4));
     System.out.println(op.subtraction(10, 5));
     op.multiplication(2, 6);
     op.division(100, 20);
     op.remainder(124, 34345);
     
     printMessage();
    }
    
    public static void printMessage(){
        System.out.println("All operators were tested, thank you!");
    }
}
