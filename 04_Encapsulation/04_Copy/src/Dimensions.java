public class Dimensions {
    private final int width; //ширина
    private final int height; //высота
    private final int length; //длинна

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Dimensions setDimensions(int width, int length, int height) {
        return new Dimensions(width, length,height);
    }

    public int getVolume() {
        return width*height*length;
    }

}
