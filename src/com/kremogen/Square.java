package com.kremogen;

class Square extends Rectangle{
    protected double side;

    public Square(){
        this.filled = false;
        this.color = "blue";
        this.width = 10;
        this.length = 10;
        side = 5;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.length = side;
    }
}
