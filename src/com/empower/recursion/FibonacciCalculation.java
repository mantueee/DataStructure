package com.empower.recursion;

public class FibonacciCalculation {

	public static void main(String[] args) {
		System.out.println(fibonaci(5));
	}

	public static int fibonaci(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;

		// int fib1 = fibonaci(n-1);
		// int fib2 = fibonaci(n-2);
		return fibonaci(n - 1) + fibonaci(n - 2);
	}
}
