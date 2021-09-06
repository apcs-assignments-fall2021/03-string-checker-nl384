import java.util.Scanner;

public class MyMain {

    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') {
                counter++;
            }
        }

        return counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return str.toLowerCase().indexOf("the") >= 0;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = scan.nextLine();

        System.out.println("Your string contains " + countABC(str) + " a's, b's, or c's");

        if (containsThe(str)) {
            System.out.println("Your string DOES contain the");
        }
        else {
            System.out.println("Your string DOES NOT contain the");
        }

        if (isPalindrome(str)) {
            System.out.println("Your string IS a palindrome");
        }
        else {
            System.out.println("Your string IS NOT a palindrome");
        }
    }
}