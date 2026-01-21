package edu.ntnu.idatt2003.marius;

import edu.ntnu.idatt2003.marius.command.capitalize.CapitalizeWordsTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeWordsTextCommandTest {
    CapitalizeWordsTextCommand capitalizeWordsCommand;

    @BeforeEach
    void setUp() {
        capitalizeWordsCommand = new CapitalizeWordsTextCommand();
    }

    @Test
    void executeIsSuccessful() {
        assertEquals("Marius Er Kul", capitalizeWordsCommand.execute("marius er kul"));
    }

    @Test
    void executeWithoutSpaces() {
        assertEquals("Marius", capitalizeWordsCommand.execute("marius"));
    }

    @Test
    void executeWithMultipleSpaces() {
        assertEquals("Marius Er Kul", capitalizeWordsCommand.execute("marius  er    kul"));
    }

    @Test
    void executeWithCapitalLettersInWords() {
        assertEquals("Marius Er Kul", capitalizeWordsCommand.execute("Marius Er Kul"));
    }
}

