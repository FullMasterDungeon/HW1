import java.util.Scanner;

public class Sort {
    public static int[] FillArray() {
        Scanner num = new Scanner(System.in);
        System.out.println("Input array lenght");
        int lenght = num.nextInt();
        if(lenght < 0){
            int[] array = new int[0];
            return array;
        }
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Input array[" + i + "]");
            int elem = num.nextInt();
            array[i] = elem;
        }
        return array;
    }

    public static void Sort() {
        var array = FillArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
