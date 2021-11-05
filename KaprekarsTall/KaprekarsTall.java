import java.util.Arrays;
import java.util.Scanner;

public class KaprekarsTall {

    public static void main(String[] args) {
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextInt();
        }

        int steps = 0;
        while (number != 6174) {
            number = sortDigits(number, true) - sortDigits(number, false);
            steps++;
        }

        System.out.println(steps);
    }

    public static int sortDigits(int number, boolean desc) {
        String string = String.valueOf(number);
        while (string.length() < 4) {
            string = "0" + string;
        }
        char[] digits = string.toCharArray();
        Arrays.sort(digits);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(digits));
        if (desc) {
            stringBuilder.reverse();
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}