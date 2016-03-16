package com.company;

public class Main {

    public static void main(String[] args) {



    }

    //7. write a function that will take one integer parameters,
    //   and will return the sum of its digits.
    //i.e sumOfDigits(123) returns 6
    //8. ....... and will return the largest digit of a number.
    //i.e largestDigit(123) returns 3
    //9. ...... and will return the number in
    // reverse order of the digits.
    //i.e reverseDigits(123) returns 321
    //i.e reverseDigits(120) returns 21
    //10. write a function that will draw a rectangle on the screen
    //    using * (print " ") to space between *.
    //11. do exercise 10 again, this time, there are two more parameters
    //    x and y, x will move the rectangle right, and y,
    //    will move the rectangle down.
    //12. write a function that draws a big X on the screen,
    //    using *. The function will take a parameter that will affect
    //    the size of the X.
    //13. draw a circle (for Shalom), parameters: radius

    public static void drawRectangle(int x, int y, int width, int height){
        for (int i = 0; i < y; i++) {
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print((i==0 || i==height-1 || j==0
                        || j==width-1) ? "*" : " ");
                //System.out.print("("+j+","+i+")");
            }
            System.out.println();
        }
    }

    public static void drawRectangle2(int width, int height){
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }


    public static void drawX(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //System.out.print("("+j+","+i+")");
                System.out.print((i==j || i==size-j-1) ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void drawCircle(int radius){
        for (int i = 0; i < radius * 2 + 10; i++) {
            for (int j = 0; j < radius * 2 + 10; j++) {
                System.out.print(isPointOnCircle(j,i,radius) ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static boolean isPointOnCircle(int x, int y, int radius){
        int deltaX = x - radius;
        int deltaY = y - radius;
        int distance = deltaX * deltaX + deltaY * deltaY - radius * radius;
        if(distance < 0)
            distance *= -1;
        return distance < 10;
    }
}
