
package calculator;

import java.util.Scanner;


public class Calculator {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double number1,number2,result;
        char operator;
        
        System.out.println("---CALCULATOR---");
        
        System.out.print("Enter the first number: ");
        number1 = sc.nextDouble();
        
        System.out.print("Enter an operator (+,-,*,/): ");
        operator = sc.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        number2 = sc.nextDouble();
        
        switch (operator){
            case '+':
                result = number1+number2;
                System.out.println("Result: "+result);
                break;
                
            case '-':
                result = number1-number2;
                System.out.println("Result: "+result);
                break;
                
            case '*':
                result = number1*number2;
                System.out.println("Result: "+result);
                break;
                
            case '/':
                if(number2 !=0){
                    result = number1/number2;
                    System.out.println("Result: "+result);
                }
                else{
                    System.err.println("Error: Division by zero not allowed");
                }                         
                break;
            default:
                System.err.println("Invalid operator");
        }
        
        sc.close();
    }
    
}

