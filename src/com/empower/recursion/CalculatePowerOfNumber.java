package com.empower.recursion;

public class CalculatePowerOfNumber {
	public static void main(String[] args) {
		System.out.println(power(2, 5));
	}

	public static int power(int num, int pow) {
		if (pow == 1) {
			return num;
		}
		return num * power(num, pow - 1);

	}
}
