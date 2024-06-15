package unidue.de;

public class ColorPoint extends Point {
    private Color color;

    ColorPoint(int x, int y, Color color) {
        super(x,y);
        this.color = color;
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
        if(obj == null ) return false;
        if(!super.equals(obj)) return false;
        if( getClass() != obj.getClass()) return super.equals(obj);
        else {
        ColorPoint colorPoint = (ColorPoint) obj;
        return getColor().equals(colorPoint.getColor());
        }
    }
}
