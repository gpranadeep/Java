import java.util.Scanner;
public class TryMultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            System.out.println("Enter another number: ");
            int a = sc.nextInt();
            int b = num/a;
            System.out.println(b);
        }catch(ArithmeticException ae){
            System.out.println("Invalid : Arithmetic Exception");   
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid : Number Format Exception");   
        }
        finally{
            System.out.println("Finally block executed");
        }
        sc.close();
    }
}