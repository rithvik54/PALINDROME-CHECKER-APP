import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC13 : Palindrome Performance Comparison =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        if (result)
            System.out.println("Result : Palindrome ✅");
        else
            System.out.println("Result : Not Palindrome ❌");

        System.out.println("Execution Time (nanoseconds): " + duration);

        sc.close();
    }

    private static boolean checkPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
