/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package internship;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class calculator {
    public void calculate()
    {
        Scanner scanner = new Scanner(System.in);
        
        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Taking the operation as input
        System.out.print("Enter the operation (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        
        // Performing the chosen operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }
            System.out.println("The result of the operation is: " + result);
        
        scanner.close();
}
public static void main(String[] args) {
        // TODO code application logic here
        calculator c1 = new calculator(); 
        c1.calculate();
}
}
