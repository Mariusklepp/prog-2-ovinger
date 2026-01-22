package edu.ntnu.idatt2003.marius;

import edu.ntnu.idatt2003.marius.command.capitalize.CapitalizeWordsTextCommand;
import edu.ntnu.idatt2003.marius.command.replace.ReplaceTextCommand;
import edu.ntnu.idatt2003.marius.command.wrap.WrapLinesTextCommand;
import edu.ntnu.idatt2003.marius.command.wrap.WrapSelectionTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class ScriptTest {
    List<TextCommand> commands;
    Script script;

    @BeforeEach
    void setUp() {
        commands = List.of(
                new ReplaceTextCommand("swimming", "running"),
                new CapitalizeWordsTextCommand(),
                new WrapSelectionTextCommand("<", ">", "Running"));


        script = new Script(commands);
    }

    @Test
    void scriptExecuteIsSuccessful() {
        String text = "i like swimming, climbing is also very fun";

        assertEquals("I Like <Running>, Climbing Is Also Very Fun", script.execute(text));
    }

}
