package edu.ntnu.idatt2003.marius;
import edu.ntnu.idatt2003.marius.command.capitalize.CapitalizeWordsTextCommand;
import edu.ntnu.idatt2003.marius.command.replace.ReplaceTextCommand;
import edu.ntnu.idatt2003.marius.command.wrap.WrapSelectionTextCommand;

import java.util.List;

public class Script {
    private final List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }

    public String execute(String text) {
        String result = text;

        for(TextCommand command : textCommands){
            result = command.execute(result);
        }
        return result;
    }
}
