import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        boolean stringsEqual = s1.equals(s2);
        System.out.println("the two given strings are equal " + stringsEqual);

        char first1 = s1.charAt(0);
        char first2 = s2.charAt(0);
        boolean firstCharEqual = (first1 == first2);
        System.out.println("First characters are equal: " + firstCharEqual);

        scanner.close();
    }
}




