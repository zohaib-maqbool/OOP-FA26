public class Distance {
    public double feet;
    public double inches;

    public Distance(){}

    public Distance(double feet,double inches){
        this.feet=feet;
        this.inches=inches;
    }

    public void display(){
        System.out.println("Feet:"+feet);
        System.out.println("Inches:"+inches);
    }

}
