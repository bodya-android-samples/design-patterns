package ru.popov.bodya.command.commands;

import ru.popov.bodya.command.Command;
import ru.popov.bodya.command.Database;

public class DeleteCommand implements Command {

    private Database mDatabase;

    public DeleteCommand(Database database) {
        mDatabase = database;
    }

    @Override
    public void execute() {
        mDatabase.delete();
    }
}
