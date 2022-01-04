public class Dimensions {
    private final double width; //mm
    private final double height; //mm
    private final double length; //mm

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Dimensions setDimensions(double width, double length, double height) {
        return new Dimensions(width, length,height);
    }

    public double getVolume() {
        return width*height*length;
    }

}
