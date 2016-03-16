package graphicshapes;

import graphicshapes.Shape;

/**
 * Created by eladlavi on 02/03/2016.
 */
public class Rectangle extends Shape {

    private int width, height;


    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void draw(){
        System.out.println("color: " + color);
    }


    /**
     * returns the width of the rectangle
     * @return a non negative number
     */
    public int getWidth() {
        return width;
    }

    /**
     * sets the width of the rectangle
     * @param width use non negative values only.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }








}
