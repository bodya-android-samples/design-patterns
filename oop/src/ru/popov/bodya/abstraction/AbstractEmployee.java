package ru.popov.bodya.abstraction;

public abstract class AbstractEmployee {

    private String mName;
    private String mAddress;
    private int mNumber;

    public abstract void doWork();

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }
}
