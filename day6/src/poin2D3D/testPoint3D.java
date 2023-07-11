package poin2D3D;

public class testPoint3D {
    public static void main(String[] args) {
        Point3D test = new Point3D();
        test.setXYZ(5,6,8);
        for (float i: test.getXYZ()
             ) {
            System.out.println(i);
        }
        System.out.println(test.toString());
    }
}
