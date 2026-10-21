import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        if(s1.equals(s2)){
            System.out.println("The two strings are equal");
        }else{
            System.out.println("The two strings are not equal");
        }
        scanner.close();
    }
}



