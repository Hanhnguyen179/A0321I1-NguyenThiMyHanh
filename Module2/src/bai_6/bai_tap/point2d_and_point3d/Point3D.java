package bai_6.bai_tap.point2d_and_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z=0;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), z};
    }
    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "Point 3D " + Arrays.toString(getXYZ());
    }
}
