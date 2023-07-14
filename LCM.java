import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        int lcm = a * b / gcd;
        System.out.println(lcm);
        in.close();
    }
}
