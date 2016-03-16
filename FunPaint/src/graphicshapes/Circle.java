package graphicshapes;



import static java.lang.Math.PI;


/**
 * Created by eladlavi on 02/03/2016.
 */
public class Circle extends Shape {
    //private int x;
    //private int y;
    private Point center;
    private int _radius;

    private final static int DEFAULT_X = 20;
    private final static int DEFAULT_Y = 20;



    //access modifiers: Public Private Protected Default


    public Circle(int x, int y, int radius){
        //this.x = x;
        //this.y = y;
        this.center = this.new Point(x, y);
        if(radius >= 0)
            this._radius = radius;
    }

    public Circle(int x, int y){
        this(x, y, 10);
    }

    public Circle(int radius){
        this(DEFAULT_X, DEFAULT_Y, radius);
    }

    public Circle(){
        this(DEFAULT_X , DEFAULT_Y);
    }

    @Override
    public double area(){
        //Math.PI is a constant, it is a final static field
        //of the class Main
        //(static means it belongs to the class as appose to
        // non-static which belongs to an object created from
        // the class).
        return PI * this._radius * this._radius;
    }

    public void fillColor(byte red, byte green, byte blue){
        //System.out.println("color: " + color);
        System.out.println("fillColor1");
    }
    public void fillColor(float hue, float saturation, float brightness){
        System.out.println("fillColor2");
    }

    @Override
    public String toString() {
        return "center = " + center.toString() + " and radius = " + _radius;
    }


    public class Point {

        private int xPos, yPos;

        public Point(int xPos, int yPos) {
            setXpos(xPos);
            setYpos(yPos);
        }



        public Point(Point p){
            this(p.xPos, p.yPos);
        }

        public int getXpos() {
            return xPos;
        }

        public void setXpos(int xPos) {
            if(xPos >= 0)
                this.xPos = xPos;
        }

        public int getYpos() {
            return yPos;
        }

        public void setYpos(int yPos) {
            if(yPos >= 0)
                this.yPos = yPos;
        }

        @Override
        public String toString() {
            return "("+commaSeparatedComponents()+")";
        }

        protected String commaSeparatedComponents(){
            return xPos+","+yPos;
        }


        @Override
        public boolean equals(Object obj) {
            if(obj == null)
                return false;
            if(this == obj)
                return true;
            if(obj instanceof Point){
                Point other = (Point)obj;
                return other.xPos == this.xPos && other.yPos == this.yPos;
            }
            return false;
        }
    }


}
