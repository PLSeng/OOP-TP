import java.util.Scanner;

public class TP5_5_Palindrome {
    public TP5_5_Palindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please gives a word to check: ");
        String word = scanner.nextLine();
        System.out.print("Choose method (REV, LOOP): ");
        String method = scanner.nextLine();
        if("REV".equals(method)){
            checkPalindromeRev(word);
        } else if("LOOP".equals(method)){
            checkPalindromeLoop(word);
        } else {
            System.out.println("Invalid method.");
        }

    }

    public void checkPalindromeRev(String word){
        String reverse = new StringBuffer(word).reverse().toString();
        if(word.equals(reverse)){
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }

    public void checkPalindromeLoop(String word){
        boolean isPalindrome = true;
        for(int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
