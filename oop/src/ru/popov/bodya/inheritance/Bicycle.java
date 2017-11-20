package ru.popov.bodya.inheritance;

public class Bicycle {

    private int mCadence;
    private int mGear;
    private int mSpeed;

    public Bicycle(int mCadence, int mGear, int mSpeed) {
        this.mCadence = mCadence;
        this.mGear = mGear;
        this.mSpeed = mSpeed;
    }

    public void setCadence(int newValue) {
        mCadence = newValue;
    }

    public void setGear(int newValue) {
        mGear = newValue;
    }

    public void applyBrake(int decrement) {
        mSpeed -= decrement;
    }

    public void speedUp(int increment) {
        mSpeed += increment;
    }


}
