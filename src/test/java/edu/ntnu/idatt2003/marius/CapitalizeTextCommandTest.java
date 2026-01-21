package edu.ntnu.idatt2003.marius;
import edu.ntnu.idatt2003.marius.command.capitalize.CapitalizeTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeTextCommandTest {

CapitalizeTextCommand capitalizeTextCommand;

    @BeforeEach
    void setUp() {
        capitalizeTextCommand = new CapitalizeTextCommand();
    }

    @Test
    void executeIsSuccessful() {
        assertEquals("Marius", capitalizeTextCommand.execute("marius"));
    }

    @Test
    void executeDoesntChangeFirstLetterWhenInUpperCase() {
        assertEquals("Marius", capitalizeTextCommand.execute("Marius"));
    }
}
