public class DefaultValues {

    public static void main(String[] args) {
        byte defaultByte;
        short defaultShort;
        int defaultInt;
        long defaultLong;

        float defaultFloat;
        double defaultDouble;

        boolean defaultBoolean;

        char defaultChar;

        // Vyvod znachen' za zazamovchuvannyam
        System.out.println("Znachennya za zamovchuvannyam:");

        System.out.println("byte: " + (defaultByte = 0));
        System.out.println("short: " + (defaultShort = 0));
        System.out.println("int: " + (defaultInt = 0));
        System.out.println("long: " + (defaultLong = 0L));

        System.out.println("float: " + (defaultFloat = 0.0f));
        System.out.println("double: " + (defaultDouble = 0.0));

        System.out.println("boolean: " + (defaultBoolean = false));

        System.out.println("char: " + (defaultChar = '\u0000'));
    }
}
