import java.util.Scanner;

public class tut9 {
    public static void main(String args[]) {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        String yn;
        // Do while loop
        do {
            System.out.println(n);
            n++;

            System.out.println("Enter Y if you want to exit ot N for continue");
            yn = sc.next();
        } while (yn.equals("Y") || yn.equals("y"));

    }
}
