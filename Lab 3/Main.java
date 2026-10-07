import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Activity 1
        System.out.println("--      -- Lab Activity 1 --     --");
        Circle c = new Circle();
        c.setRadius(16);
        c.display();
        c.circumference();

//        Activity 2
        System.out.println("\n--      -- Lab Activity 2 --     --");
        Rectangle r = new Rectangle();
        r.setLength(15);
        r.setWidth(28.5);
        r.area();

//        Activity 3
        System.out.println("\n--      -- Lab Activity 3 --     --");
        Point p = new Point();
        p.setX(18);
        p.setY(4);
        p.display();

        System.out.println("\n\n ---      --Graded Lab Tasks--     -- \n");
//        Lab Task 01
        System.out.println("\n\n --     --Lab Task 1--      --");
        Marks m = new Marks();
        m.setStd1(45);
        m.setStd2(33);
        m.setStd3(48);
        System.out.printf("Marks:\nStudent1: %d, Student2: %d, Student3: %d",m.getStd1(),m.getStd2(),m.getStd3());

//        lab Task 02
        System.out.println("\n\n --     --Lab Task 2--      --");
        Account a1 = new Account();
        a1.depositAmount(500);
        a1.depositAmount(200);
        System.out.println("Available balance:"+a1.getBalance());

        Account a2 = new Account(a1.getBalance());
        System.out.println("Balance of Scond account:"+a2.getBalance());

//        Lab Task 03
        System.out.println("\n\n --     --Lab Task 3--      --");
        Student s1 = new Student("Zohaib", new int[]{10, 20, 30, 40, 50});
        System.out.printf("Student 1:\nStudent Name: %s\nAverage Marks: %.2f\n",s1.name,s1.average());
        Student s2 = new Student("Ahmad", new int[]{20,40,30,50,60});
        System.out.printf("Student 2:\nStudent Name: %s\nAverage Marks: %.2f\n",s2.name,s2.average());

        if (s1.average() > s2.average()){
            System.out.println("Student 1 has highest Average Marks of: "+s1.average());
        }else{
            System.out.println("Student 2 has highest Average Marks of: "+s2.average());
        }

        Student s3 = new Student(s1.name,s2.Result_array);
        System.out.printf("Student 3:\nStudent Name: %s\nAverage Marks: %.2f\n",s3.name,s3.average());

//        Lab Task 04
        System.out.println("\n\n --     --Lab Task 4--      --");
        HotDogStand stand1 = new HotDogStand(001, 5);
        HotDogStand stand2 = new HotDogStand(002, 10);
        HotDogStand stand3 = new HotDogStand(003, 6);

        stand1.justSold();
        stand1.justSold();
        stand1.justSold();

        stand2.justSold();

        stand3.justSold();
        stand3.justSold();

        System.out.println("Stand " + stand1.getStandID() + " sold: " + stand1.getHotDogsSold() + " hot dogs.");

        System.out.println("Stand " + stand2.getStandID() + " sold: " + stand2.getHotDogsSold() + " hot dogs.");

        System.out.println("Stand " + stand3.getStandID() + " sold: " + stand3.getHotDogsSold() + " hot dogs.");

    }
}