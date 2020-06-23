package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        if (numbers.length > 0) {
            IntStream marks = IntStream.range(0, numbers.length);
            marks.forEach(s -> System.out.println(numbers[s]));
            //Arrays.stream(numbers)
            //.forEach(s -> System.out.println(s));

            OptionalDouble average = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average();

            return average.getAsDouble();
        }
        return 0;
    }

}
