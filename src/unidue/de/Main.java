package unidue.de;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Color color = new Color((byte) 225,(byte) 225,(byte) 225);
        Color color2 = new Color(color);
	    Point p1 = new Point(1,2);
	    Point p2 = new Point(p1);
        ColorPoint p3 = new ColorPoint(1,2, color);
        ColorPoint p4 = new ColorPoint(p3);
        CounterPoint p5 = new CounterPoint(1,2);
        CounterPoint p6 = new CounterPoint(p5);
        System.out.println("Equals method on copyed Objects");
        System.out.println(p1.equals(p2));
        System.out.println(p3.equals(p4));
        System.out.println(p5.equals(p6));
        System.out.println("Equals method on copyed Objects hashCodes");
        System.out.println(p1.hashCode()==p2.hashCode());
        System.out.println(p3.hashCode()==p4.hashCode());
        System.out.println(p5.hashCode()==p6.hashCode());
        System.out.println(color.hashCode()==color2.hashCode());

        Point clonePoint = (Point) p1.clone();
        ColorPoint cloneColorP =(ColorPoint) p3.clone();
        CounterPoint cloneCounterP =(CounterPoint) p5.clone();
        Color cloneColor =(Color) color.clone();
        System.out.println("Equals method on cloned Objects");
        System.out.println(clonePoint.equals(p1));
        System.out.println(cloneColorP.equals(p3));
        System.out.println(cloneCounterP.equals(p5));
        System.out.println(cloneColor.equals(color));
        System.out.println("Equals method on cloned Objects hashCodes");
        System.out.println(p1.hashCode()==clonePoint.hashCode());
        System.out.println(p3.hashCode()==cloneColorP.hashCode());
        System.out.println(p5.hashCode()==cloneCounterP.hashCode());
        System.out.println(color.hashCode()==cloneColor.hashCode());



    }
}
