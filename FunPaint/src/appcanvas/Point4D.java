package appcanvas;

/**
 * Created by eladlavi on 06/03/2016.
 */
public final class Point4D extends Point3D {

    private int x4;

    public Point4D(int x1, int x2, int x3, int x4) {
        super(x1, x2, x3);
        this.x4 = x4;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        if(x4 >= 0)
            this.x4 = x4;
    }

    @Override
    protected String commaSeparatedComponents() {
        return super.commaSeparatedComponents() + "," + x4;
    }
}
