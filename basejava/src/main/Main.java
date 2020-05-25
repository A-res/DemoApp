package main;

public class Main  {
    public static void main(String[] args) {
        System.out.println("Hello");
        Car car = new CarImpl();
        car.setSpeed(200);
        car.drive();
       // car.out
    }
 }
