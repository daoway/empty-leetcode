package com.blogspot.ostas.leetcode.all.medium.coin_change.recursive;

public class CoinChangeProblem {

    public static void main(String[] args) {
        int[] coinValues = {1, 2, 5, 10, 25, 50};
        int N = coinValues.length;
        int count=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        for (int m = 0; m < N; m++) {
                            for (int n = 0; n < N; n++) {
                                //int val = coinValues[i] + 2*coinValues[j] + 5*coinValues[k] + 10*coinValues[l] + 25*coinValues[m] + 50*coinValues[n];
                                int val = coinValues[i] + coinValues[j] + coinValues[k] + coinValues[l] + coinValues[m] + coinValues[n];
                                //System.out.printf("%s %s %s %s %s %s = %s %n",i,j,k,l,m,n,val);
                                if(val == 100){
                                    System.out.printf("%s %s %s %s %s %s = %s %n",i,j,k,l,m,n,val);
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("total count : "+count);
    }
}
