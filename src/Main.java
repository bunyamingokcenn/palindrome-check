import java.util.Scanner;
public class Main {

    static boolean isPalindrome(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Palindrom kontrol için kelime girin : ");
        String inputString = input.nextLine();

        if (isPalindrome(inputString)){
            System.out.println(inputString + " palindrom kelimedir.");
        } else {
            System.out.println(inputString + " palindrom kelime değildir.");
        }
    }
}