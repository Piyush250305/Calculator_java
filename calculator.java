package internship;
import java.util.Scanner;

public class calculator {
    public void calculate()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the operation (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        
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
        calculator c1 = new calculator(); 
        c1.calculate();
}
}
