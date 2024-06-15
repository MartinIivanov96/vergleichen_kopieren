package unidue.de;

public class CounterPoint {
    private Point point;
    private static int counter=0;

    CounterPoint(int x, int y) {
        this.point = new Point(x,y);
        counter++;
    }
    //copy constructor
    public CounterPoint(CounterPoint point){
        this.point = new Point(point.getPoint());
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        CounterPoint point = (CounterPoint) obj;
        return this.getPoint().equals(point.getPoint());
    }

    @Override
    public int hashCode() {
        return 31*getPoint().hashCode() + Integer.hashCode(counter);
    }
}
