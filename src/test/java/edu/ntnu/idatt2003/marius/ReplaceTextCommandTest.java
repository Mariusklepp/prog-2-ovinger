package edu.ntnu.idatt2003.marius;

import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.ntnu.idatt2003.marius.command.replace.ReplaceTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReplaceTextCommandTest {
    ReplaceTextCommand replaceCommand;

    @BeforeEach
    void setUp() {
        replaceCommand = new ReplaceTextCommand("swimming", "running");
    }

    @Test
    void executeIsSuccessful() {
       assertEquals("I like running. running is fun",
                replaceCommand.execute("I like swimming. swimming is fun"));
    }

    @Test
    void executeWithoutTargetWordInText() {
        assertEquals("I like climbing. climbing is fun", replaceCommand.execute("I like climbing. climbing is fun"));
    }

    @Test
    void executeWithBlankString() {
        assertEquals("", replaceCommand.execute(""));
    }

    @Test
    void getTarget() {
        assertEquals("swimming", replaceCommand.getTarget());
    }

    @Test
    void getReplacement() {
        assertEquals("running", replaceCommand.getReplacement());
    }
}