package edu.ntnu.idatt2003.marius.command.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand{
    String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        int position = text.indexOf(selection);

        if (position == -1) {
        return text;
        }

        String before = text.substring(0, position);
        String middle = text.substring(position, position + selection.length());
        String after = text.substring(position + selection.length());
        return before + getOpening() + middle + getEnd() + after;
    }

    public String getSelection() {
        return selection;
    }
}
