package com.example.lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinmaxUnitTest {
    @Test
    public void max_correct_one_value() {
        assertEquals(5, Minmax.max(5));
    }
    @Test
    public void max_correct_two_values() {
        assertEquals(5, Minmax.max(5, 0));
    }
    @Test
    public void max_correct_three_values() {
        assertEquals(10, Minmax.max(5, 10, 1));
    }
    @Test
    public void max_correct_many_values() { assertEquals(100, Minmax.max(2, 66, 22, 1, 66, 100, 100, 99)); }
    @Test
    public void max_correct_negative_value() {
        assertEquals(-10, Minmax.max(-50, -20, -10, -99));
    }
    @Test
    public void min_correct_one_value() {
        assertEquals(5, Minmax.min(5));
    }
    @Test
    public void min_correct_two_values() {
        assertEquals(0, Minmax.min(5, 0));
    }
    @Test
    public void min_correct_three_values() {
        assertEquals(1, Minmax.min(5, 10, 1));
    }
    @Test
    public void min_correct_many_values() { assertEquals(1, Minmax.min(2, 66, 22, 1, 66, 100, 100, 99)); }
    @Test
    public void min_correct_negative_value() {
        assertEquals(-99, Minmax.min(-50, -20, -10, -99));
    }
}

