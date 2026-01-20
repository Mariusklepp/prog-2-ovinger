package edu.ntnu.idatt2003.marius;

import edu.ntnu.idatt2003.marius.command.wrap.WrapTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapTextCommandTest {
    WrapTextCommand wrapCommand;

    @BeforeEach
    void setUp() {
        wrapCommand = new WrapTextCommand("--", "==");
    }

    @Test
    void executeTest() {
        assertEquals("--Hello==",wrapCommand.execute("Hello"));
    }

    @Test
    void executeWhenTextIsEmptyTest() {
        assertEquals("--==",wrapCommand.execute(""));
    }

    @Test
    void getOpeningTest() {
        assertEquals("--", wrapCommand.getOpening());
    }

    @Test
    void getEndTest() {
        assertEquals("==", wrapCommand.getEnd());
    }
}
