package com.blogspot.ostas.leetcode.all.medium.coin_change.recursive;

public class CoinChangeProblem {

    public static void main(String[] args) {
        var x = countWays(100);
        System.out.println("total count : "+x);
    }

    // T(n) = O(amount^coinCount)
    static int countWays(int amount) {
        int count = 0;
        for (int a = 0; a <= amount; a++) {
            for (int b = 0; b <= amount / 2; b++) {
                for (int c = 0; c <= amount / 5; c++) {
                    for (int d = 0; d <= amount / 10; d++) {
                        for (int e = 0; e <= amount / 25; e++) {
                            for (int f = 0; f <= amount / 50; f++) {
                                if (a + 2*b + 5*c + 10*d + 25*e + 50*f == amount) {
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
}
