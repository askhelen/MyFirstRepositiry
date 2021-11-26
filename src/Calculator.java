import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] s1 = string.split("[0-9]");
        if (s1.length > 2 ){
            throw new Exception();
        }
        String[] s = string.split("[^A-Za-z0-9]");
        int a;
        int b;
        if (s[0].matches("[0-9]+")) {
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            if (a < 0 || a > 10) {
                throw new Exception();
            }
            if (b < 0 || b > 10) {
                throw new Exception();
            }
            if (string.contains("+")) {
                System.out.println(a + b);
            } else if (string.contains("-")) {
                System.out.println(a - b);
            } else if (string.contains("*")) {
                System.out.println(a * b);
            } else if (string.contains("/")) {
                System.out.println(a / b);
            } else {
                throw new Exception();
            }
        } else {
            a = RimNumber.parseRimNumber(s[0]);
            b = RimNumber.parseRimNumber(s[1]);
            if (a < 0 || a > 10) {
                throw new Exception();
            }
            if (b > 0 && b <= 10) {
                throw new Exception();
            }
            if (string.contains("+")) {
                int c = a + b;
                RimAnswer.parseRimAnswer(c);
            } else if (string.contains("-")) {
                int c = a - b;
                RimAnswer.parseRimAnswer(c);
            } else if (string.contains("*")) {
                int c = a * b;
                RimAnswer.parseRimAnswer(c);
            } else if (string.contains("/")) {
                int c = a / b;
                RimAnswer.parseRimAnswer(c);
            } else {
                throw new Exception();
            }
        }
    }
}



