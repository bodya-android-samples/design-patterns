package ru.popov.bodya.command.commands;

import ru.popov.bodya.command.Command;
import ru.popov.bodya.command.Database;

public class UpdateCommand implements Command {

    private Database mDatabase;

    public UpdateCommand(Database database) {
        mDatabase = database;
    }

    @Override
    public void execute() {
        mDatabase.update();
    }
}
