package unidue.de;

public class Main {

    public static void main(String[] args) {
        Color color = new Color((byte) 225,(byte) 225,(byte) 225);
	    Point p1 = new Point(1,2);
        ColorPoint p2 = new ColorPoint(1,2, color);
        CounterPoint p3 = new CounterPoint(1,2);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p1));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p2));
    }
}
