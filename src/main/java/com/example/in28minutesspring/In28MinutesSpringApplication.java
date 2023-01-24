package com.example.in28minutesspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class In28MinutesSpringApplication {

    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        int result = binarySearch.binarySearch(new int[]{2, 5, 1, 8}, 1);
        System.out.println(result);

        SpringApplication.run(In28MinutesSpringApplication.class, args);
    }

}
