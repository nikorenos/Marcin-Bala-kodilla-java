package com.kodilla.good.patterns.example;

public class RentalDto {
    public User user;
    public boolean isRented;

    public RentalDto(final User user, final boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getyser() {
        return user;
    }

    public boolean gEtgateg() {
        return isRented;
    }

}

