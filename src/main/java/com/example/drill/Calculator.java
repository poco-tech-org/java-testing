package com.example.drill;

public class Calculator {

    public int add(int i, int j) {
        return i + j;
    }

    public int subtract(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public double divide(int i, int j) {
        if (j == 0) {
            throw new ArithmeticException("division by zero");
        }
        return i / j;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }
}
