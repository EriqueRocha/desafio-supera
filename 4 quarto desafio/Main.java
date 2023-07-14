import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String originalLine = unscrambleLine(line);
            System.out.println(originalLine);
        }
        scanner.close();
    }

    private static String unscrambleLine(String line) {
        int length = line.length();
        int halfLength = length / 2;
        StringBuilder originalLine = new StringBuilder(length);

        for (int i = halfLength - 1; i >= 0; i--) {
            originalLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= halfLength; i--) {
            originalLine.append(line.charAt(i));
        }

        return originalLine.toString();
    }
}
