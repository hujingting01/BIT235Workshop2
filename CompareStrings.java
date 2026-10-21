package BIT235Workshop2;
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        boolean stringEqual = str1.equals(str2);
        System.out.println("the two given strings are equal: " + stringEqual);

        boolean firstCharEqual = str1.charAt(0) == str2.charAt(0);
        System.out.println("First characters are equal: " + firstCharEqual);

        scanner.close();
    }
}


