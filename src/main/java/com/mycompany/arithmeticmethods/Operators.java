/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticmethods;

/**
 *
 * @author lab_services_student
 */

//DO NOT rename the class inside the code editor, do it in the solution explorer
public class Operators {
    
//Approach #1
    public static int summation(int a, int b){
        return a + b;
    }
    
//Approach #2    
    public static String subtraction(int a, int b){
        return "Sum of "+a+" and "+b+" is "+(a+b);
    }
    
//Approach #3
    public void multiplication(int a, int b){
        double total = a * b;
        System.out.println("Multiplication of "+a+" and "+b+" is "+total);
    }
    public void division(int a, int b){
        float total = a / b;
        System.out.println(a+" divided by "+b+" is "+total);
    }
    public void remainder(int a, int b){
        int total = a % b;
        System.out.println("Remainder between "+a+" and "+b+"is"+total);
    }
}
