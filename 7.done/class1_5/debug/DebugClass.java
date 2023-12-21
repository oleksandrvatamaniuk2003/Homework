package class1_5.debug;

public class DebugClass {
    public static void debug(String... args) {
        for (String arg : args) {
            System.out.println("Debug: " + arg);
        }
    }
}
