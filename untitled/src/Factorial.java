import java.util.Scanner;

public class Factorial {
    public static void Factorial() {
        int res = 1;
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if(a < 0){
            System.out.println("incorrect input");
            return;
        }
        for (; a > 0; a--) {
            res *= a;
        }
        System.out.println(res);
    }
}
