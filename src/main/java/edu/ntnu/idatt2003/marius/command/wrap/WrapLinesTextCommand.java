package edu.ntnu.idatt2003.marius.command.wrap;

public class WrapLinesTextCommand extends WrapTextCommand{
    String result;

    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text) {
        String[] lines = text.split("\n");
        result = "";
        for (int i = 0; i < lines.length; i++) {
            result += getOpening() + lines[i] + getEnd();
            if (i < lines.length - 1) {
                result += System.lineSeparator();
            }
        }
        return  result;
    }
}
