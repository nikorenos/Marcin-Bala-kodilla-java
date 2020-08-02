package com.kodilla.good.patterns.example;

import java.time.LocalDateTime;

public interface RentalRepository {
    public void createRental(User user, LocalDateTime from, LocalDateTime to);
}
