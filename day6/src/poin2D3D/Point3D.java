package poin2D3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y,float z) {
        super(x, y);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{getX(),getY(),z};
    }
    public String toString() {
        return "x: " + getX() + ", y: " + getY() + " , z: " + getZ();
    }
}
