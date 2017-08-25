package com.amit.dp.structural.bridge.shape.impl;

import com.amit.dp.structural.bridge.color.Color;
import com.amit.dp.structural.bridge.shape.Shape;

public class Circle extends Shape {
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void fillColor() {
        System.out.print("Circle filled with color ");
        color.addColor();
    }
}
