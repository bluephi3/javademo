package net.ibokette.kotlindemo.entity;

import lombok.Data;

@Data
public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
}
