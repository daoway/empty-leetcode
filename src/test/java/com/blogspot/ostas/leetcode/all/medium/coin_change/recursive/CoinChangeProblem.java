package com.blogspot.ostas.leetcode.all.medium.coin_change.recursive;

public class CoinChangeProblem {

    public static void main(String[] args) {
        var x = countWays(100);
        System.out.println("total count : " + x);

        var x1 = countWays(100, new int[]{1, 2, 5, 10, 25, 50});
        System.out.println("total count : " + x1);

    }

    // T(n) = O(amount^coinCount)
    //naive solution with hardcoded coins
    static int countWays(int amount) {
        int count = 0;
        for (int a = 0; a <= amount; a++) {
            for (int b = 0; b <= amount / 2; b++) {
                for (int c = 0; c <= amount / 5; c++) {
                    for (int d = 0; d <= amount / 10; d++) {
                        for (int e = 0; e <= amount / 25; e++) {
                            for (int f = 0; f <= amount / 50; f++) {
                                if (a + 2 * b + 5 * c + 10 * d + 25 * e + 50 * f == amount) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    //added params coins[] but for loops is same as before
    static int countWaysX(int amount, int[] coins) {
        int count = 0;

        for (int a = 0; a <= amount / coins[0]; a++) {
            for (int b = 0; b <= amount / coins[1]; b++) {
                for (int c = 0; c <= amount / coins[2]; c++) {
                    for (int d = 0; d <= amount / coins[3]; d++) {
                        for (int e = 0; e <= amount / coins[4]; e++) {
                            for (int f = 0; f <= amount / coins[5]; f++) {
                                if (a * coins[0] + b * coins[1] + c * coins[2] + d * coins[3] + e * coins[4] + f * coins[5] == amount) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    static int countWays(int amount, int[] coins) {
        int[] coinCount = new int[coins.length];
        return countWaysHelper(amount, coins, coinCount, 0);
    }

    static int countWaysHelper(int remainingAmount, int[] coins, int[] coinCount, int index) {
        if (remainingAmount == 0) {
            return 1; // If remaining amount is 0, there is one way to make change, which is using no coins
        }

        if (remainingAmount < 0 || index == coins.length) {
            return 0; // If remaining amount is negative or we've exhausted all coins, there's no way to make change
        }

        int ways = 0;
        int maxCount = remainingAmount / coins[index];
        for (int i = 0; i <= maxCount; i++) {
            coinCount[index] = i;
            ways += countWaysHelper(remainingAmount - i * coins[index], coins, coinCount, index + 1);
            System.out.println(ways);
        }
        return ways;
    }

}
