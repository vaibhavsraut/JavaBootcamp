import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int num;
        int power=1;
        System.out.println("Enter the value of N(0<=N<31):");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("Below is table of powers of 2:");
        System.out.println("2^0 = "+power);
        for(int i=1;i<=num;i++){
            power*=2;
            System.out.println("2^"+i+" = "+power);
        }
    }
}
