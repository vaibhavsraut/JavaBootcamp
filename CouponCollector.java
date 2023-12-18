import java.util.Random;

public class CouponCollector {

    // Function to generate a random coupon number
    private static int getRandomCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }

    // Function to simulate the process of collecting distinct coupons
    private static int collectDistinctCoupons(int n) {
        boolean[] collectedCoupons = new boolean[n];
        int distinctCouponsCount = 0;
        int randomNumbersGenerated = 0;

        while (distinctCouponsCount < n) {
            int randomCoupon = getRandomCoupon(n);
            randomNumbersGenerated++;

            // Check if the generated coupon is distinct
            if (!collectedCoupons[randomCoupon - 1]) {
                collectedCoupons[randomCoupon - 1] = true;
                distinctCouponsCount++;
            }
        }

        return randomNumbersGenerated;
    }

    public static void main(String[] args) {
        // Input: Number of distinct coupon numbers
        int numberOfCoupons = 10; // You can change this value

        // Simulate the process and get the total random numbers needed
        int totalRandomNumbers = collectDistinctCoupons(numberOfCoupons);

        // Output: Total random numbers needed to have all distinct numbers
        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }
}
