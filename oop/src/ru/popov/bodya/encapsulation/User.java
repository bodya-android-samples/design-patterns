package ru.popov.bodya.encapsulation;

public class User {

    private String mName;
    private String mSurname;
    private int mAge;

    String getName() {
        return mName;
    }

    void setName(String name) {
        mName = name;
    }

    String getSurname() {
        return mSurname;
    }

    void setSurname(String surname) {
        mSurname = surname;
    }

    int getAge() {
        return mAge;
    }

    void setAge(int age) {
        mAge = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "mName='" + mName + '\'' +
                ", mSurname='" + mSurname + '\'' +
                ", mAge=" + mAge +
                '}';
    }
}
