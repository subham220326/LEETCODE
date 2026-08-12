import java.util.Scanner;
public class LongestPalindrome {
    public static void longest(String pal) {
        if (pal == null || pal.length() == 0) {
            System.out.println("String is empty.");
            return;
        }

      StringBuilder sb = new StringBuilder("^");
        for (int i = 0; i < pal.length(); i++) {
            sb.append('#').append(pal.charAt(i));
        }
        sb.append("#$");
        String newString = sb.toString();

        int newLen = newString.length();
        int[] palindromeLength = new int[newLen];
        int center = 0, right = 0;



        for (int i = 1; i < newLen - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                palindromeLength[i] = Math.min(right - i, palindromeLength[mirror]);
            }


            while (newString.charAt(i + 1 + palindromeLength[i]) == newString.charAt(i - 1 - palindromeLength[i])) {
                palindromeLength[i]++;
            }


            if (i + palindromeLength[i] > right) {
                center = i;
                right = i + palindromeLength[i];
            }
        }



        int maxLength = 0;
        int centerIndex = 0;
        for (int i = 1; i < newLen - 1; i++) {
            if (palindromeLength[i] > maxLength) {
                maxLength = palindromeLength[i];
                centerIndex = i;
            }
        }


        int startIndex = (centerIndex - maxLength) / 2;
        String result = pal.substring(startIndex, startIndex + maxLength);

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        longest(inputString);
        scanner.close();
    }
}
