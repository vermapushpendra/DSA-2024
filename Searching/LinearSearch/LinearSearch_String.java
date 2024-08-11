package Searching.LinearSearch;

import java.util.Arrays;

public class LinearSearch_String {
    public static void main(String[] args) {
        String name = "Pushpendra";
        char c = 'k';

        // char n[] = name.toCharArray();
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(Arrays.toString(n));

        System.out.println(linearSearch(name, c));
    }

    static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

}
