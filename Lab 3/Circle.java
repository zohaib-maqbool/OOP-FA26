public class Circle {
    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void display(){
        System.out.println("Radius = "+ radius);
    }
    public void circumference(){
        System.out.println("Circumference of Circle is : " + (2*3.14*radius));
    }
}
