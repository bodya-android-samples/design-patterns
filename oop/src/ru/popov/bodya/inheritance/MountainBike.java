package ru.popov.bodya.inheritance;

public class MountainBike extends Bicycle {

    private int mSeatHeight;

    MountainBike(int startHeight,
                 int startCadence,
                 int startSpeed,
                 int startGear) {
        super(startCadence, startSpeed, startGear);
        mSeatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        mSeatHeight = newValue;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + mSeatHeight +
                '}';
    }
}
