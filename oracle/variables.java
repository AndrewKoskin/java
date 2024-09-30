/**
 * Instance variables (non-static fields) - field of instance of class.
 * Class variables (static fields) - field that belongs to a class. Same on different objects.
 * static int gears = 6. Also, "final" will indicate that field will never change: final static int gears = 6
 * Local variables  - local field in method, only visible in that method
 * Parameters - public static void main(String[] args). args - parameters. Parameter - variable, not field
 * Naming like camelCase, constants - final static int CAMEL_CASE = 2. Underscore uses only in constants
 */
class MyClass {
    static int classVariable = 5;
    final static int constantClassVariable = 1;
    int instanceVariable = 0;

    void meow(String[] args) {
        int localVariable;  // Variables may not be initialized when they are declared
    }
}

/**
 * Primitive data types - no need to assign with declaration. Compiler will set default value if field not initialized.
 * Using default values - bad practice.
 * name/defaultValue
 * byte/0                       - 8-bit [-128, 127]. Saving memory in large arrays.
 * The fact that variable's range is limited can serve as form of documentation
 * short/0                      - 16-bit [-32768, 32767]. Same as byte saving memory in large arrays. When memory needed
 * int/0                        - 32-bit [-2**31, 2**31 - 1]
 * long/0L                      - 64-bit [-2**63, 2**63 - 1]. Used when need a range wider than int
 * float/0.0f                   - 32-bit - saving arrays of floating point numbers
 * double/0.0d                  - 64-bit - default choice for decimal values
 * char/'\u0000'                - 16-bit - single Unicode character. Min '\u0000' or 0, max '\uffff' or 65535
 * string(or any object)/null   - sequence of characters. Object, String s = "string". Immutable
 * Technically not a primitive data type, but it has special support given by language
 * boolean/false                - 1-byte
 */
class Solution {
    static int classVariable = 5;
    final static int constantClassVariable = 1;
    int instanceVariable = 0;

    public static void main(String[] args) {
        byte localByte = 127;
        short localShort = -32768;  // Variables may not be initialized when they are declared
        int localInt = 123123123;
        long localLong = 1231231231;
        float localFloat = 1.1123f; // Float always ends with F or f
        double localDouble = 1.23456; // Double can optionally be ended with D or d

        // Number systems
        int decVal = 10; // Decimal value
        int hexVal = 0x1aff; // Hexadecimal values
        int binVal = 0b01010; // Binary values

        // Characters and Srting literals
        char localChar = 'm';
        char localChar2 = '\u0123'; // If code redactor does not support UTF-16
        String localString = "abcdef\u0123";
        System.out.println(localString);
        boolean result = true;

        // Underscores can improve readability of code. Only numerical values. Only between digits
        int myHex = 0x1_123_123; // not like 0x_123
        float myFloat = 1_123.123f; // not like 123_.123f

    }
}
