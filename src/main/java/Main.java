public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0);

        if (c1.compareAre(c1.getRadius(),c2.getRadius()) == 1){
            System.out.println("hinh trong voi ban kinh: " + c1.getRadius() + " nho hon hinh tron voi ban kinh: " + c2.getRadius());
        } else if (c1.compareAre(c1.getRadius(),c2.getRadius()) == -1){
            System.out.println("hinh trong voi ban kinh: " + c1.getRadius() + " lon hon hinh tron voi ban kinh: " + c2.getRadius());
        }else System.out.println("hai hinh tron bang nhau");
    }
}
