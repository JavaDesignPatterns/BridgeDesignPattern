package com.amit.dp.structural.bridge.shape.impl;

import com.amit.dp.structural.bridge.color.Color;
import com.amit.dp.structural.bridge.shape.Shape;

public class Square extends Shape {
    public Square(Color c) {
        super(c);
    }

    @Override
    public void fillColor() {
        System.out.print("Square filled with color ");
        color.addColor();
    }
}
