package unidue.de;

public class CounterPoint extends Point {
    private static int counter=0;

    CounterPoint(int x, int y) {
        super(x,y);
        counter++;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null ) return false;
        if(getClass() != obj.getClass()) return super.equals(obj);

    }
}
