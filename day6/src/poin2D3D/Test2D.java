package poin2D3D;

public class Test2D {
    public static void main(String[] args) {
        Point2D p = new Point2D(5,6);
        for (float i: p.getXY()) {
            System.out.println(i);
        }
        System.out.println(p.toString());
    }
}
