public class CaseCheck {
    public static void main(String[] args) {
        String ch = "Hello";
        // System.out.println(ch.charAt(0));
        char c = ch.charAt(0);
        if (c > 'a' && c < 'z') {
            System.out.println("lower Case");
        } else
            System.out.println("Upper Case");
    }
}
