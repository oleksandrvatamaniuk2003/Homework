package class1_5;

import static class1_5.debug.DebugClass.debug;

public class TestProgram {
    public static void main(String[] args) {
        // with debug output
        debug("This", "is", "a", "debug", "message.");

        // without debug
        class1_5.debugoff.DebugClass.debug("This", "is", "a", "debug", "message.");
    }
}
