import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibo = 0;

        for (int i = 0; i <=n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }

        System.out.println(fibo);

    }
}
