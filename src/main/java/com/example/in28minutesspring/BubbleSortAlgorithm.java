package com.example.in28minutesspring;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort() {
        System.out.println("BubbleSortAlgorithm executed");
        return new int[0];
    }
}
