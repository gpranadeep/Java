
import java.util.Scanner;
public class AIOOBE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0;
        while(true) {
            try {
                arr[i]= i+1;
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Loop exited due to exception: " + e.getMessage());
                break; 
            }

        }
        System.out.println("Resultant Array: ");
        for(int x: arr) {
            System.out.println(x);
        }
        sc.close();
    }
}
