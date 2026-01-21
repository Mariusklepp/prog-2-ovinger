package edu.ntnu.idatt2003.marius;

import edu.ntnu.idatt2003.marius.command.wrap.WrapSelectionTextCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WrapSelectionTextCommandTest {
    WrapSelectionTextCommand wrapSelectionCommand;

    @BeforeEach
    void setUp() {
        wrapSelectionCommand = new WrapSelectionTextCommand("--",
                                                               "--",
                                                            "Marius");
    }

    @Test
    void executeIsSuccessful() {
        assertEquals("Hei jeg heter --Marius--",
                wrapSelectionCommand.execute("Hei jeg heter Marius"));
    }

    @Test
    void executeWithoutSelection() {
        assertEquals("Hei jeg heter Brage",
                wrapSelectionCommand.execute("Hei jeg heter Brage"));
    }

    @Test
    void executeWithBlankSelection() {
        assertEquals("",
                wrapSelectionCommand.execute(""));
    }
}

