import java.util.Arrays;

public class CoinChange322 {

    public int coinChange(int[] coins, int amount) {

        int noOfCoins = 0;
        if (coins.length == 0) {
            return noOfCoins;
        }

        if (amount <= 0) {
            return noOfCoins;
        }
        Arrays.sort(coins);
        int i = coins.length - 1;
        while (i >= 0) {
            if (amount >= coins[i]) {
                noOfCoins += amount / coins[i];
                System.out.println(noOfCoins);
                amount = amount % coins[i];
            }
            i--;
        }
        if (amount > 0) {
            return -1;
        }

        return (noOfCoins > 0) ? noOfCoins : -1;
    }
}
