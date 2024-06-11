import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to be printed (>0): ");
        int n= sc.nextInt();
        int a=0,b=1,c;
        for (int i=1;i<=n;i++) {
            if (i == 1) System.out.println(0);
            else if (i == 2) System.out.println(1);
            else {
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
