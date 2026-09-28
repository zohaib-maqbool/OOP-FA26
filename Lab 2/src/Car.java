public class Car {
    private String Make;
    public String Model;
    public int year;

    public Car(){
        System.out.println("Un-initialized Object");
    }

    public Car(String make,String Model,int year){
        this.Make=make;
        this.Model=Model;
        this.year=year;
        System.out.println("Initialized Object");
    }

}
