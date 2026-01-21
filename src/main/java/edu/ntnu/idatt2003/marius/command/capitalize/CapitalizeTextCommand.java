package edu.ntnu.idatt2003.marius.command.capitalize;

import edu.ntnu.idatt2003.marius.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

    public CapitalizeTextCommand() {
    }

    @Override
    public String execute(String text) {
        if (text == null || text.isBlank()) {
            return text;
        }

        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
}
