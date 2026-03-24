public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

