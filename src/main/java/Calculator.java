public class Calculator {


    public static double addValues(double a, double b) {
        return a + b;
    }


    public static double subtractValues(double a, double b) {
        return a - b;
    }


    public static double multiplyValues(double a, double b) {
        return a * b;
    }


    public static double divideValues(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + addValues(num1, num2));
        System.out.println("Subtraction: " + subtractValues(num1, num2));
        System.out.println("Multiplication: " + multiplyValues(num1, num2));
        System.out.println("Division: " + divideValues(num1, num2));
    }
}
