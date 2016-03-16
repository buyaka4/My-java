package appcanvas;

/**
 * Created by eladlavi on 06/03/2016.
 */
public class Point3D extends Point {

    private int zPos;


    public Point3D(int xPos, int yPos, int zPos){
        super(xPos, yPos);
        setZpos(zPos);
    }


    public int getZpos() {
        return zPos;
    }

    public void setZpos(int zPos) {
        if(zPos >= 0)
            this.zPos = zPos;
    }

    @Override
    protected String commaSeparatedComponents() {
        return super.commaSeparatedComponents() + "," + zPos;
    }
}
