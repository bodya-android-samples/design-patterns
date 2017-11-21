package ru.popov.bodya.command.commands;

import ru.popov.bodya.command.Command;
import ru.popov.bodya.command.Database;

public class SelectCommand implements Command {

    private Database mDatabase;

    public SelectCommand(Database database) {
        mDatabase = database;
    }

    @Override
    public void execute() {
        mDatabase.select();
    }
}
