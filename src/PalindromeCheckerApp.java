import java.util.Scanner;
import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC8 : LinkedList Palindrome Check =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // add characters
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // compare from both ends
        while (list.size() > 1) {

            if (!list.removeFirst().equals(list.removeLast())) {
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
