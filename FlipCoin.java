import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        int num;
        int headCount=0;
        int tailCount=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to flip a coin:");
        num = sc.nextInt();

        if (num == 0) {
            System.err.println("Error: N cannot be 0.");
            return;
        }

        for (int i=0;i<num;i++){
            float coin = new Random().nextFloat();
            if(coin<0.5){
                tailCount++;
            }else {
                headCount++;
            }
        }


        System.out.println("Head Percentages: " + ((headCount*100)/num) + "%");
        System.out.println("Tail Percentages: " + ((tailCount*100)/num) + "%");


    }
}
