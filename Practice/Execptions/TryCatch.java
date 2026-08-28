import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int a = 10/num;
            System.out.println(a);
        }catch(ArithmeticException ae){
            System.out.println("Invalid : Arithmetic Exception");   
        }
        finally{
            System.out.println("Finally block executed");
        }
        sc.close();
    }
}
