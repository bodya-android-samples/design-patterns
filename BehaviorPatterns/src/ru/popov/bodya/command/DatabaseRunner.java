package ru.popov.bodya.command;

import ru.popov.bodya.command.commands.DeleteCommand;
import ru.popov.bodya.command.commands.InsertCommand;
import ru.popov.bodya.command.commands.SelectCommand;
import ru.popov.bodya.command.commands.UpdateCommand;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();

    }
}
