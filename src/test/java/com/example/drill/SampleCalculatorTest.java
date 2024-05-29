package com.example.drill;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleCalculatorTest {

    @Test
    @DisplayName("add: 引数に与えられた2つの数を加算した結果を返す")
    public void add_success() {
        // ## Arrange ##
        var cut = new Calculator();

        // ## Act ##
        var actual = cut.add(1, 2);

        // ## Assert ##
        assertEquals(3, actual);
    }

    @Test
    @DisplayName("isPositive: 引数が正の数の場合、true を返す")
    public void isPositive_positive() {
        var cut = new Calculator();
        assertTrue(cut.isPositive(1));
    }

    @Test
    @DisplayName("isPositive: 引数がゼロの場合、false を返す")
    public void isPositive_zero() {
        var cut = new Calculator();
        assertFalse(cut.isPositive(0));
    }

    @Test
    @DisplayName("isPositive: 引数が負の数の場合、false を返す")
    public void isPositive_negative() {
        var cut = new Calculator();
        assertFalse(cut.isPositive(-1));
    }

    @Test
    @DisplayName("divide: 第二引数が0のとき例外を返す")
    public void divide_ArithmeticException() {
        var cut = new Calculator();

        assertThrows(ArithmeticException.class, () -> cut.divide(6, 0));
    }

}