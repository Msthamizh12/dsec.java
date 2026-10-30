public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        System.out.println("Addition: " + add(7, 8));
        System.out.println("Subtraction: " + subtract(14, 8));
        System.out.println("Multiplication: " + multiply(10, 12));
        System.out.println("Division: " + divide(45, 7));
    }
}
