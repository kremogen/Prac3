package com.kremogen;

class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        width = 10;
        length = 10;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea() {
        return length * width / 2;
    }

    public double getPerimeter(){
        return length * 3;
    }
}
