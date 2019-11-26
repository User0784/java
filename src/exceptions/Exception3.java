package exceptions;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("a=");
        int a = reader.nextInt();
        System.out.print("b=");
        int b = reader.nextInt();
        try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println("Error!");// e.printStackTrace();
        }
    }

    private static void divide(int a, int b) {
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }
}
