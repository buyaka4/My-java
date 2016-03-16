package com.company;

public class Main {

    public static void main(String[] args) {
	    SomeInterface someInterface = new SomeClass();
        someInterface.stam();

        MotionDetector motionDetector = new MotionDetector();
        AlarmSpeaker alarmSpeaker = new AlarmSpeaker();
        motionDetector.setListener(alarmSpeaker);
        motionDetector.motion();

        Triangle t = new Triangle();
        t.area();


        Drawable[] drawables = new Drawable[4];
        drawables[0] = new Point(3, 5);
        drawables[1] = new Segment(new Point(3,1), new Point(7,8));
        drawables[2] = new Triangle();
        drawables[3] = new Image();

        boolean[][] canvas = new boolean[50][50];
        for(Drawable d : drawables)
            d.drawOnCanvas(canvas);



    }
    public static void sortArray(Comparable[] numbers) {
        boolean isSorted = false;
        int compareUpTo = numbers.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < compareUpTo; i++) {
                //if (numbers[i] > numbers[i + 1]) {
                if (numbers[i].compareTo(numbers[i+1]) > 0) {
                    Comparable temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isSorted = false;
                }
            }
            compareUpTo--;
        }
    }

}


class Image implements Drawable{

    @Override
    public void drawOnCanvas(boolean[][] canvas) {

    }
}

class Point implements Comparable, Drawable{
    private int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Point(Point other){
        this(other.xPos, other.yPos);
    }

    public int getXpos() {
        return xPos;
    }

    public void setXpos(int xPos) {
        this.xPos = xPos;
    }

    public int getYpos() {
        return yPos;
    }

    public void setYpos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /**
     * distance from another point
     * @param p another point to calculate distance from
     * @return the distance from the other point or -1 p is null.
     */
    public double distanceFromPoint(Point p){
        if(p == null){
            return -1;
        }
        double deltaX = this.xPos - p.xPos;
        double deltaY = this.yPos - p.yPos;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
    public double distanceFromOrigin(){
        return distanceFromPoint(new Point(0, 0));
    }

    @Override
    public void drawOnCanvas(boolean[][] canvas){

    }

}

interface Drawable{
    public void drawOnCanvas(boolean[][] canvas);
}



class Segment implements Drawable{
    private Point p1, p2;
    private double length;
    private boolean isLengthGood;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        isLengthGood = false;
    }

    public Segment(Segment seg){
        this(seg.getP1(), seg.getP2());
    }

    public Point getP1() {
        return new Point(p1);
    }

    public void setP1(Point p1) {
        this.p1 = p1;
        isLengthGood = false;
    }

    public Point getP2() {
        return new Point(p2);
    }

    public void setP2(Point p2) {
        this.p2 = p2;
        isLengthGood = false;
    }

    public double length(){
        if(!isLengthGood){
            length = p1.distanceFromPoint(p2);
            isLengthGood = true;
        }
        return length;
    }

    public double distanceFromSegment(Point p){
        return 0;
    }

    public boolean isPointOnSegment(Point p){
        //TODO: take care of vertical or horizontal segment
        if(distanceFromSegment(p) == 0){
            int left = p1.getXpos();
            int right = p2.getXpos();
            if(p1.getXpos() > p2.getXpos()){
                left = p2.getXpos();
                right = p1.getXpos();
            }
            if(p.getXpos() >= p1.getXpos() && p.getXpos() <= p2.getXpos()){
                return true;
            }
        }
        return false;
    }

    @Override
    public void drawOnCanvas(boolean[][] canvas){

    }
}


class Triangle implements Drawable{
    private Point p1, p2, p3;

    @Override
    public void drawOnCanvas(boolean[][] canvas){
        Segment seg1 = new Segment(p1, p2);
        Segment seg2 = new Segment(p2, p3);
        Segment seg3 = new Segment(p3, p1);
        seg1.drawOnCanvas(canvas);
        seg2.drawOnCanvas(canvas);
        seg3.drawOnCanvas(canvas);
    }

    public double perimeter(){
        Segment seg1 = new Segment(p1, p2);
        Segment seg2 = new Segment(p2, p3);
        Segment seg3 = new Segment(p3, p1);
        return seg1.length() + seg2.length() + seg3.length();
    }




    public double area(){
        Segment base = new Segment(p1, p2);
        return base.distanceFromSegment(p3) * base.length() * 0.5;
    }
}

interface SomeInterface{

    /**
     * stam should stam things
     */
    void stam();

}

class SomeClass implements SomeInterface{

    public void stam2(){

    }

    @Override
    public void stam() {

    }
}

class A implements Comparable{


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class MotionDetector{

    interface MotionListener{
        void motionDetected();
    }

    private MotionListener listener;

    public void setListener(MotionListener listener) {
        this.listener = listener;
    }

    public void motion(){
        //code that detects motion

        if(listener != null){
            listener.motionDetected();
        }
    }
}


class AlarmSpeaker implements MotionDetector.MotionListener{

    @Override
    public void motionDetected() {
        System.out.println("stop!!!! don't move");
    }
}








