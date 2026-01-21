package edu.ntnu.idatt2003.marius.command.capitalize;

import edu.ntnu.idatt2003.marius.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

    public CapitalizeTextCommand() {
    }

    @Override
    public String execute(String text) {
        String firstLetter = text.substring(0,1);
        return firstLetter.toUpperCase() + text.substring(1);
    }
}
