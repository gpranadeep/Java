
import java.util.Scanner;
public class ThrowsExample {
    void age(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        ThrowsExample obj = new ThrowsExample();
        try {
            obj.age(age);
        } catch (Exception e) {
            System.out.println("Error in age method: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        sc.close();
    }
}
