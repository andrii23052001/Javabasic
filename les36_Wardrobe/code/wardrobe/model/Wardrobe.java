package wardrobe.model;

public class  Wardrobe implements  Comparable<Wardrobe> {

    double height;

    double width;//ширина

    double depth;//глубина

    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double area(){        // площадь шкафа
        return width * depth;
    }
    public double volume(){
        return area() * height; // площадь умножить на высоту будет обьем
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Wardrobe wardrobe = (Wardrobe) object;

        if (Double.compare(height, wardrobe.height) != 0) return false;
        if (Double.compare(width, wardrobe.width) != 0) return false;
        return Double.compare(depth, wardrobe.depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }
    @Override
    public int compareTo(Wardrobe other) {
        return Double.compare(this.height,other.height);
    }
}
