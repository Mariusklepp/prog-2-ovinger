package edu.ntnu.idatt2003.marius.command.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

    public CapitalizeWordsTextCommand() {
    }

    @Override
    public String execute(String text) {
        String[] words = text.split("\\s+");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
