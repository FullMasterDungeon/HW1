import java.util.Scanner;

public class Fibonacci {
    public static void Fibonacci() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int numbers[] = new int[n];
        if(n < 2 && n > 0){
            System.out.println(n);
            return;
        }
        if(n <= 0){
            System.out.println("incorrect input");
            return;
        }
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                System.out.println(1);
            } else {
                numbers[i] = numbers[i - 2] + numbers[i - 1];
                System.out.println(numbers[i]);
            }
        }
    }
}
