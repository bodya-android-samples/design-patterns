package ru.popov.bodya.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase(new JavaApplication());
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
