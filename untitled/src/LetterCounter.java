import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LetterCounter {
    static Character[] c = {'b', 'c', 'c', 'f', 'g', 'h', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'x', 'z', 'j', 'q'};
    static ArrayList<Character> consonant = new ArrayList<>(Arrays.asList(c));
    static Character[] v = {'a', 'e', 'i', 'o', 'u', 'y'};
    static ArrayList<Character> vowels = new ArrayList<>(Arrays.asList(v));

    public static void LetterCounter() throws IOException {
        int vow = 0;
        int con = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        sentence = sentence.toLowerCase();
        char[] arr = sentence.replace(" ", "").toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (vowels.contains(arr[i])) {
                vow += 1;
            }
            if (consonant.contains(arr[i])) {
                con += 1;
            }
        }
        System.out.println("Vowels = " + vow + "\n" + "Consonant = " + con);
    }
}
