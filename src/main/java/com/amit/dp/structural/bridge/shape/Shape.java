package com.amit.dp.structural.bridge.shape;

import com.amit.dp.structural.bridge.color.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color c){
        this.color=c;
    }

    abstract public void fillColor();
}
