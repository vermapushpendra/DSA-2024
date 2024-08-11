package Function;

import java.util.Scanner;

public class Example2 {

    public static void main(String args[]) {

        String ans = greet();
        System.out.println(ans);
    }

    // Function/Method ->> Non void
    static String greet() {
        String greeting = "Hello! Good Morning";
        return greeting;

    }
}
