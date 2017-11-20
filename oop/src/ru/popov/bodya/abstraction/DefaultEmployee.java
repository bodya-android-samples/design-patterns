package ru.popov.bodya.abstraction;

public class DefaultEmployee extends AbstractEmployee {
    @Override
    public void doWork() {
        System.out.println("DefaultEmployee doWork implementation");
    }
}
