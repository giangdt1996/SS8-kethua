package bt1;

public class Main {
    public static void main(String[] args) {
        Point3D point = new Point3D(1.0f, 2.0f, 3.0f);

        // Test getXYZ()
        float[] coordinates = point.getXYZ();
        System.out.println("Tọa Độ (XYZ): " + coordinates[0] + ", " + coordinates[1] + ", " + coordinates[2]);

        // Test toString()
        System.out.println("Point3D: " + point.toString());
    }
}
