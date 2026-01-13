/**
 * A simple calculator class demonstrating basic arithmetic.
 */
public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division with error handling
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Cannot divide by zero.");
        }
        return a / b;
    }

    // Example Usage
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + myCalc.add(num1, num2));
        System.out.println("Subtraction: " + myCalc.subtract(num1, num2));
        System.out.println("Multiplication: " + myCalc.multiply(num1, num2));
        
        try {
            System.out.println("Division: " + myCalc.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
