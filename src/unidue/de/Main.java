package unidue.de;

public class Main {

    public static void main(String[] args) {
        Color color = new Color((byte) 225,(byte) 225,(byte) 225);
        Color color2 = new Color(color);
	    Point p1 = new Point(1,2);
	    Point p2 = new Point(p1);
        ColorPoint p3 = new ColorPoint(1,2, color);
        ColorPoint p4 = new ColorPoint(p3);
        CounterPoint p5 = new CounterPoint(1,2);
        CounterPoint p6 = new CounterPoint(p5);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p3.equals(p4));
        System.out.println(p4.equals(p3));
        System.out.println(p5.equals(p6));
        System.out.println(p6.equals(p5));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());
        System.out.println(p6.hashCode());
        System.out.println(color.hashCode());
        System.out.println(color2.hashCode());

    }
}
