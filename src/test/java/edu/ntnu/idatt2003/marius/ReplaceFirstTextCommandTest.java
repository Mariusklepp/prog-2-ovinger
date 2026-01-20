package edu.ntnu.idatt2003.marius;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import edu.ntnu.idatt2003.marius.command.replace.ReplaceFirstTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReplaceFirstTextCommandTest {
    ReplaceFirstTextCommand replaceFirstCommand;

    @BeforeEach
    void setUp() {
        replaceFirstCommand = new ReplaceFirstTextCommand("swimming", "running");
    }

    @Test
    void executeTest() {
        assertEquals("running is fun, but swimming is also fun",
                replaceFirstCommand.execute("swimming is fun, but swimming is also fun"));
    }

    @Test
    void executeWithoutTargetWord() {
        assertEquals("climbing is fun, but running is also fun",
                replaceFirstCommand.execute("climbing is fun, but running is also fun"));
    }

    @Test
    void executeWithBlankString() {
        assertEquals("", replaceFirstCommand.execute(""));
    }
}
