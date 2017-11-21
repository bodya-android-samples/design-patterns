package ru.popov.bodya.command;

public class Developer {

    private Command mInsert;
    private Command mUpdate;
    private Command mSelect;
    private Command mDelete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        mInsert = insert;
        mUpdate = update;
        mSelect = select;
        mDelete = delete;
    }

    public void insertRecord() {
        mInsert.execute();
    }

    public void updateRecord() {
        mUpdate.execute();
    }

    public void selectRecord() {
        mSelect.execute();
    }

    public void deleteRecord() {
        mDelete.execute();
    }
}
