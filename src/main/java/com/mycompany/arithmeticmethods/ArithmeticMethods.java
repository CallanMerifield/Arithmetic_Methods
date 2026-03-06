/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arithmeticmethods;
import java.util.*;
/**
 *
 * @author lab_services_student
 */

public class ArithmeticMethods {
//SEE OPERATORS class for different implementation approaches
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter first int value: ");
        int num1 =  sc.nextInt();
        
        System.out.print("Enter second int value: ");
        int num2 =  sc.nextInt();
     
        System.out.println("The Summation: " + Operators.summation(num1, num2));
        System.out.println("The Difference: " + Operators.subtraction(num1, num2));
        System.out.println("The Product: " + Operators.multiplication(num1, num2));
        System.out.println("The Quotient: " + Operators.division(num1, num2));
        System.out.println("The Remainder: " + Operators.remainder(num1, num2));
        
        printMessage();
    }
    
    public static void printMessage(){
        System.out.println("All operators were tested, thank you!");
    }
}
