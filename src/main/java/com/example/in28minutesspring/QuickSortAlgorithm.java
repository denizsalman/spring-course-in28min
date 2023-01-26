package com.example.in28minutesspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort() {
        System.out.println("QuickSortAlgorithm executed");
        return new int[0];
    }
}
