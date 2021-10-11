package net.ibokette.kotlindemo.entity;

import lombok.Data;

@Data
public class House {
   private final String street; 
   private final String color; 
   private final int addressNumber; 
   private final int year; 
}
