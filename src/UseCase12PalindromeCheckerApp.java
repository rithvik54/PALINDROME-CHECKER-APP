import java.util.Scanner;
import java.util.Stack;

/* MAIN CLASS */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC12 : Strategy Pattern Palindrome =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        if (result)
            System.out.println("Result : Palindrome ✅");
        else
            System.out.println("Result : Not Palindrome ❌");

        sc.close();
    }
}

/* STRATEGY INTERFACE */
interface PalindromeStrategy {

    boolean check(String input);
}

/* CONCRETE STRATEGY */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++)
            stack.push(input.charAt(i));

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != stack.pop())
                return false;
        }

        return true;
    }
}
