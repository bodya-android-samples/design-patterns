package ru.popov.bodya.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {

        MountainBike bike = new MountainBike(1, 2, 3, 4);
        bike.setCadence(123);
        bike.speedUp(2);
        bike.applyBrake(1);
        System.out.println(bike);
    }

}
