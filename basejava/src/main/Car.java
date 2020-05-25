package main;

public interface Car {
    int getSpeed();
    float getEngineVolume();
    void setSpeed(int speed);
    void drive(){
        System.out.println("drive" + " at speed " + speed);
    }
}
