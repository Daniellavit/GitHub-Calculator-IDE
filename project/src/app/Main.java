package app;

public class Main {

    static int a = 8;
    static int b = 2;
    static int c = add(a, b);
    static int d = multiply(a, b);
    static int e = subtraction(a, b);
    static int f = division(a, b);

    public static void main(String[] args) {

        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }
    private static int division(int a, int b) {
        return a / b;
    }
}
