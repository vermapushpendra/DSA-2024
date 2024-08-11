import java.util.Scanner;

public class switchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fruits name");
        String fruit = sc.next();

        switch (fruit) {
            case "Grapes":
                System.out.println("The Color is Green and also sometime is Black");
                break;

            case "Mango":
                System.out.println("It's Yellow in color and It is King of the Fruits");
                break;

            default:
                System.out.println("Fruit is not Available that you have entered");
                break;

        }

        System.out.println("Enter language name");
        String language = sc.next();

        switch (language) {
            case "Hindi" -> System.out.println("Mother Language of India");
            case "English" -> System.out.println("Most Used Language in Whole world");
            default -> System.out.println("Language is not Available in this Bucket");

        }

    }
}