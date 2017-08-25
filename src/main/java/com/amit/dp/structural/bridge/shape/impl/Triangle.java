package com.amit.dp.structural.bridge.shape.impl;

import com.amit.dp.structural.bridge.color.Color;
import com.amit.dp.structural.bridge.shape.Shape;

public class Triangle extends Shape {
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void fillColor() {
        System.out.print("Triangle filled with color ");
        color.addColor();
    }
}
