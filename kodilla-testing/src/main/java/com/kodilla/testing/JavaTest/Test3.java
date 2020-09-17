package com.kodilla.testing.JavaTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kowalski");
        names.add("Nowak");
        names.add("Knop");

        List<String> companies = new LinkedList<>();
        companies.add("BTS");
        companies.add("KQO");
        companies.add("RSCP");

        printAll(names);
        printAll(companies);
    }

    private static void printAll(List<String> items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}

