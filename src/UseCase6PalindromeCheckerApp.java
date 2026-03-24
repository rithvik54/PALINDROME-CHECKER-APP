import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC6 : Queue + Stack Palindrome Check =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // insert into both structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        // compare
        for (int i = 0; i < input.length(); i++) {

            if (stack.pop() != queue.remove()) {
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