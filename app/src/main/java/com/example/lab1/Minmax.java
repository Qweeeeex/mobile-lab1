package com.example.lab1;

public class Minmax {
    public static int max(int ... values) {
       int max = values[0];
       for (int i: values) {
           if (i > max) {
               max = i;
           }
       }
       return max;
    }

    public static int min(int ... values) {
        int min = values[0];
        for (int i: values) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
