import java.util.Scanner;

public class Largest {
    public static void main(String args[]) {
        // Check largest number among of three input numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // at beggening suppose a is largest
        int max = a;

        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        System.out.println(max + " is the largest value");

        // One Another way
        int max2 = Math.max(c, Math.max(a, b));
        System.out.println(max2);
    }
}
