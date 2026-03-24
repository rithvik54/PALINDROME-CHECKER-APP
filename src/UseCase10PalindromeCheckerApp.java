import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC10 : Normalized Palindrome Check =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        // normalization
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("Result : Palindrome ✅");
        else
            System.out.println("Result : Not Palindrome ❌");

        sc.close();
    }
}