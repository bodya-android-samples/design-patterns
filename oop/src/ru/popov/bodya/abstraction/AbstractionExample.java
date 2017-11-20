package ru.popov.bodya.abstraction;

public class AbstractionExample {

    public static void main(String[] args) {
        AbstractEmployee employee = new DefaultEmployee();
        employee.doWork();
    }

}
