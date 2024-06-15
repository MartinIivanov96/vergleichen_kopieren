package unidue.de;

public class Color implements Cloneable{
    private byte red, green, blue;

    Color(byte b1, byte b2, byte b3) {
        this.red = b1;
        this.green = b2;
        this.blue = b3;
    }
    //copy constructor
    public Color(Color color) {
        this.red = color.getRed();
        this.blue = color.getBlue();
        this.green = color.getGreen();
    }

    public byte getRed() {
        return red;
    }

    public byte getGreen() {
        return green;
    }

    public byte getBlue() {
        return blue;
    }

    public void setRed(byte red) {
        this.red = red;
    }

    public void setGreen(byte green) {
        this.green = green;
    }

    public void setBlue(byte blue) {
        this.blue = blue;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Color color = (Color) obj;
        return this.getRed() == color.getRed() && this.getGreen() == color.getGreen() && this.getBlue() == color.getBlue();
    }

    @Override
    public int hashCode() {
        return 31*Byte.hashCode(red) + Byte.hashCode(green) +Byte.hashCode(blue);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (Color) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
