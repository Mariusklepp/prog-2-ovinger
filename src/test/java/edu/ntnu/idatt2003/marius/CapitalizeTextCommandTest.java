package edu.ntnu.idatt2003.marius;
import edu.ntnu.idatt2003.marius.command.capitalize.CapitalizeTextCommand;
import org.junit.jupiter.api.BeforeEach;

public class CapatalizeTextCommandTest {

CapitalizeTextCommand capatalizeTextCommand;

    @BeforeEach
    void setUp() {
        capatalizeTextCommand = new CapitalizeTextCommand();
    }
}
