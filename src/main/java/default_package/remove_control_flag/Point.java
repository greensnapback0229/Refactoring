package default_package.remove_control_flag;

public class Point {
    Point[] _point;
    public int x;
    public int y;

    public boolean existPoint(int x, int y) {
        boolean f = false;
        boolean ff = false;

        for (Point p : _point) {
            if (p.x == x && p.y == y) {
                return true;
            }
        }
        return false;
    }
}
