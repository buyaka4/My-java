package appcanvas;

/**
 * Created by eladlavi on 06/03/2016.x
 */
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
