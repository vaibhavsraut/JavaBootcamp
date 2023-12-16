import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        int n;
        int factor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        n = sc.nextInt();

        System.out.println("The prime factors of "+ n + " are:");

        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}
