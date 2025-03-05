package edu.miu.cs.cs425.citylibrarycliapp;

import edu.miu.cs.cs425.citylibrarycliapp.model.Publisher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var welcomeMessage = "Welcome to Cs425 City Library";
        System.out.printf("%s\n", welcomeMessage);
        var publishers = List.of(
                new Publisher(101, "McGraw-Hill", "sales@mcgraw.com", null),
                new Publisher(102, "Apress", "sales@apress.com", "(123) 456-7890"),
                new Publisher(103, "Penguin-RandomHouse", null, null),
                new Publisher(104, "Addison-Wesley", null, null)
        );
        publishers.forEach(System.out::println);
    }
}