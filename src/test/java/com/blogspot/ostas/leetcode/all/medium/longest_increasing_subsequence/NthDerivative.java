package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class NthDerivative {

    // Memoization map to store computed derivatives
    private static Map<Integer, Double> memo = new HashMap<>();

    // Step size for derivative calculation
    private static final double H = 0.0001;

    // Function to compute nth derivative of f(x)
    public static double nthDerivative(Function<Double, Double> f, double x, int n) {
        if (n == 0) {
            return f.apply(x); // Base case: 0th derivative is the function itself
        } else {
            if (!memo.containsKey(n)) {
                // Recursive case: Compute nth derivative by differentiating the (n-1)th derivative
                double result = nthDerivative(xx -> derivative(f, xx, H), x, n - 1);
                memo.put(n, result);
            }
            return memo.get(n);
        }
    }

    // Derivative function (simplified)
    public static double derivative(Function<Double, Double> f, double x, double h) {
        return (f.apply(x + h) - f.apply(x)) / h; // Basic numerical differentiation formula
    }

    // Example function: f(x) = x^2
    public static double exampleFunction(double x) {
        return Math.log10(x);
    }

    public static void main(String[] args) {
        double xValue = 2;
        int nthOrder = 3;
        double result = nthDerivative(NthDerivative::exampleFunction, xValue, nthOrder);
        System.out.printf("The %dth derivative at x = %.2f is %.2f\n", nthOrder, xValue, result);
    }
}
