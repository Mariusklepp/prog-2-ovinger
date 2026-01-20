package edu.ntnu.idatt2003.marius;

import edu.ntnu.idatt2003.marius.command.wrap.WrapLinesTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapLinesTextCommandTest {
    WrapLinesTextCommand wrapLinesCommand;

    @BeforeEach
    void setUp() {
        wrapLinesCommand = new WrapLinesTextCommand("--", "==");
    }

    @Test
    void executeIsSuccessful() {
        assertEquals("--Hei==" + System.lineSeparator() +
                        "--Jeg heter Marius==" + System.lineSeparator() +
                        "--Jeg er 20 år gammel==",
                wrapLinesCommand.execute("Hei\nJeg heter Marius\nJeg er 20 år gammel"));
    }

    @Test
    void executeWithOnlyOneLine() {
        assertEquals("--Hei, Jeg heter Marius, Jeg er 20 år gammel==",
                wrapLinesCommand.execute("Hei, Jeg heter Marius, Jeg er 20 år gammel"));
    }

    @Test
    void executeWithEmptyString() {
        assertEquals("--==",
                wrapLinesCommand.execute(""));
    }

    @Test
    void executeWithEmptyLineInBetween() {
        assertEquals("--Hei==" + System.lineSeparator() +
                        "--==" + System.lineSeparator() +
                        "--Hade==",
                wrapLinesCommand.execute("Hei\n\nHade"));
    }
}

