package main;

public abstract class CarImpl implements Car {
    int year;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected int speed=100;

    private void out(String str){
        System.out.println(str);
    }

}
