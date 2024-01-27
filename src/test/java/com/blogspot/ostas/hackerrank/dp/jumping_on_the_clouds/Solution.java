package com.blogspot.ostas.hackerrank.dp.jumping_on_the_clouds;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        int n = c.size();
        int max = Integer.MAX_VALUE - 200;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = (c.get(1) == 1) ? max : 1;
        for (int i = 2; i < n; i++) {
            dp[i] = (c.get(i) == 1) ? max : 1 + Math.min(dp[i - 1], dp[i - 2]);
        }
        return dp[n - 1];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
