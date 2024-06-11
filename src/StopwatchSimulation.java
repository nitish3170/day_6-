import java.util.Scanner;

public class StopwatchSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double startTime = System.currentTimeMillis();
        int c=0;
        for (int i=0;i<1000000;i++){
            c++;
        }
        double endTime=System.currentTimeMillis();
        System.out.printf("Time Elapsed= "+ (endTime-startTime));
    }
}
