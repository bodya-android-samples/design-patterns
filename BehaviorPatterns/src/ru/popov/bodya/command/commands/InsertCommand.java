package ru.popov.bodya.command.commands;

import ru.popov.bodya.command.Command;
import ru.popov.bodya.command.Database;

public class InsertCommand implements Command {

    private Database mDatabase;

    public InsertCommand(Database database) {
        mDatabase = database;
    }

    @Override
    public void execute() {
        mDatabase.insert();
    }
}
