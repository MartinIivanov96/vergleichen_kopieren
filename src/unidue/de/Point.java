package unidue.de;


public class Point {
    private int x,y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    //copy constructor
    public Point(Point point){
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return getX() == point.getX() && getY() == point.getY();
    }

    @Override
    public int hashCode() {
        return 31*Integer.hashCode(getX())+Integer.hashCode(getY());
    }
}
