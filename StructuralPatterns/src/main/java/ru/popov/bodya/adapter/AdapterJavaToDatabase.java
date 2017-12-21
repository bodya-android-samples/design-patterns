package ru.popov.bodya.adapter;

public class AdapterJavaToDatabase implements Database {

    private final JavaApplication mJavaApplication;

    AdapterJavaToDatabase(JavaApplication javaApplication) {
        mJavaApplication = javaApplication;
    }

    @Override
    public void insert() {
        mJavaApplication.saveObject();
    }

    @Override
    public void update() {
        mJavaApplication.updateObject();
    }

    @Override
    public void select() {
        mJavaApplication.loadObject();
    }

    @Override
    public void remove() {
        mJavaApplication.deleteObject();
    }
}
