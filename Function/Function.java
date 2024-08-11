package Function;

import java.util.Scanner;

public class Function {
    public static void main(Example2 args[]) {
        // // Q: Take the input of the 2 numbers and print the Sum Without
        // function/Method
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number 1");
        // int a = sc.nextInt();

        // System.out.println("Enter Number 1");
        // int b = sc.nextInt();

        // int sum = a + b;
        // System.out.println(sum);
        sum();
        int ans = sum2();
        System.out.println(ans);
    }

    // Function/Method
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        sc.close();

        int sum = a + b;
        System.out.println("Sum is: " + sum);

    }

    // Function/Method ->> Non void
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        sc.close();

        int sum = a + b;
        return sum;

    }
}
