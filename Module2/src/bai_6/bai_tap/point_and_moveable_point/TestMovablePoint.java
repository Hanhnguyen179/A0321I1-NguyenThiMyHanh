package bai_6.bai_tap.point_and_moveable_point;

public class TestMovablePoint {
    public static void main(String[] args) {
        Point point = new Point(9, 17);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(15,18,25,35);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
