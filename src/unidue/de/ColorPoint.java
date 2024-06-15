package unidue.de;

public class ColorPoint implements Cloneable {
    private Point point;
    private Color color;

    ColorPoint(int x, int y, Color color) {
       this.point = new Point( x , y);
        this.color = color;
    }
    //copy constructor
    public ColorPoint(ColorPoint colorPoint){
        this.point = new Point(colorPoint.getPoint());
        this.color = new Color(colorPoint.getColor());
    }

    public Point getPoint() {
        return point;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        ColorPoint colorPoint = (ColorPoint) obj;
        return getColor().equals(colorPoint.getColor()) && getPoint().equals(colorPoint.getPoint());

    }

    @Override
    public int hashCode() {
        return 31*getPoint().hashCode() + getColor().hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (ColorPoint) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
