package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[] numbers) {

        IntStream stream = IntStream.range(0, numbers.length-1);
        stream.forEach(System.out::println);

        OptionalDouble average = IntStream.range(0, numbers.length-1)
                .average();
        return average;

    }

}
