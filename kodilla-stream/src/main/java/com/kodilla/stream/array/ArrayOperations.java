package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[] numbers) {

        IntStream marks = IntStream.range(0, numbers.length);
                marks.forEach(s -> System.out.println(numbers[s]));
        //Arrays.stream(numbers)
                //.forEach(s -> System.out.println(s));

        OptionalDouble average = IntStream.range(0, numbers.length)
                    .map (n -> numbers[n])
                        .average();
        return average;
    }

}
