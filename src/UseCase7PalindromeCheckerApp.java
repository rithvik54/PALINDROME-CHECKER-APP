import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC7 : Deque Palindrome Check =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        Deque<Character> deque = new LinkedList<>();

        // insert characters
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // compare from both ends
        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Result : Palindrome ✅");
        else
            System.out.println("Result : Not Palindrome ❌");

        sc.close();
    }
}