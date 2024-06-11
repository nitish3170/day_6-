import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coupons");
        int n= sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        Random random=new Random();
        while (set.size()!=n){
            set.add(random.nextInt(n));
            count++;
        }
        System.out.printf("Total number of random number required to generate all distinct numbers : %d",count);
    }
}
