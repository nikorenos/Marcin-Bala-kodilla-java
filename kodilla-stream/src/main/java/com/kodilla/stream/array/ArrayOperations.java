package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length).forEach(s -> System.out.println(numbers[s]));

        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().orElse(0);

        /*if (numbers.length > 0) {
            IntStream.range(0, numbers.length).forEach(s -> System.out.println(numbers[s]));
            //Arrays.stream(numbers)
            //.forEach(s -> System.out.println(s));

            OptionalDouble average = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average();

            return average.getAsDouble();
        }
        return 0;*/
    }

}
