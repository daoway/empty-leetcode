package com.blogspot.ostas.leetcode.all.easy.convert_the_temperature;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: celsius = 36.50
    Output: [309.65000,97.70000]
    Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
    Example 2:
    Input: celsius = 122.11
    Output: [395.26000,251.79800]
    Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.
      Constraints:
    0 <= celsius <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        double celsius = 36.50;
        double[] expected = new double[]{309.65000, 97.70000};
        var result = solution.convertTemperature(celsius);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        double celsius = 122.11;
        double[] expected = new double[]{395.26000, 251.79800};
        var result = solution.convertTemperature(celsius);
        assertThat(result).isEqualTo(expected);
    }

}
