
import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new Exception("Access denied - You must be at least 18 years old.");
            } else {
                System.out.println("Access granted");
            }
        } catch (Exception e) {
            System.out.println("Error in main method: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        sc.close();
    }
}
