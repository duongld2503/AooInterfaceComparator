public class Circle implements Comparator {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public int compareAre(double c1, double c2) {
        if (c1 < c2){
            return 1;
        } else if (c1 > c2){
            return -1;
        } return 0;
    }
}
