public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");


        // Lab Task 2

        Rectangle rect = new Rectangle();
        System.out.println(rect.Calculatearea());
        Rectangle rect1 = new Rectangle(10, 20);
        System.out.println(rect1.Calculatearea());


        // Lab Task 3
        Point p1 = new Point();
        p1.movePoint(2, 3);
        p1.display();

        Point p2 = new Point();
        p2.movePoint(2, 3);
        p2.display();


        //Graded Lab Task 1

        Circle c1 = new Circle();
        c1.radius=345.5432;
        c1.calcCirc();


        double a = c1.calcCirc();
        System.out.println(c1.calcCirc());


        Circle c2 = new Circle(2.84803);
        double b = c2.calcCirc();
        System.out.println(b);


        // Graded Lab Task 2

        Account a1 = new Account();
        a1.balance=10000;
        a1.active=true;
        a1.deposit(2000);
        System.out.println(a1.balance);

        Account a2 = new Account(20000,false);
        a2.withdraw(2000);
        System.out.println(a2.balance);


        // Graded Lab Task 3

        Distance d1 = new Distance();
        d1.feet= 12;
        d1.inches=12;
        d1.display();

        Distance d2 = new Distance(24,24);
        d2.display();


        // Graded Lab Task 4

        Marks m1 = new Marks();
        m1.Cs=20;
        m1.Eng=30;
        m1.Urdu=25;
        System.out.println(m1.Sum());

        Marks m2 = new Marks(35,45,40);
        System.out.println(m2.Sum());


        // Graded Lab Task 5

        Time t1 = new Time();
        t1.hr=23;
        t1.min=56;
        t1.seconds=60;
        t1.displayTime();

        Time t2 = new Time(12,46,34);
        t2.displayTime();




    }
}