import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n;
        double harmonic = 0;
        System.out.println("Enter the Harmonic value N(N>0):");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n == 0) {
            System.err.println("Error: N cannot be 0.");
            return;
        }

        for(int i=1;i<=n;i++){
            harmonic += (1.0/i);
        }

        System.out.println("The "+n+"th Harmonic value is: "+harmonic);



    }
}
