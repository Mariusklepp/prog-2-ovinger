package edu.ntnu.idatt2003.marius.command.wrap;
import edu.ntnu.idatt2003.marius.TextCommand;

public class WrapTextCommand implements TextCommand {
    private final String opening;
    private final String end;

    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    @Override
    public String execute(String text) {
        return opening + text + end;
    }

    public String getOpening() {
        return opening;
    }

    public String getEnd() {
        return end;
    }
}
