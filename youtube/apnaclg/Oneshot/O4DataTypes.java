public class O4DataTypes {
    public static void main(String args[]) {
        // Primitive data types

        // Integer types
        byte byteVar = 127; // Range: -128 to 127
        short shortVar = 32767; // Range: -32,768 to 32,767
        int intVar = 2147483647; // Range: -2^31 to 2^31 - 1
        long longVar = 9223372036854775807L; // Range: -2^63 to 2^63 - 1

        // Floating-point types
        float floatVar = 3.4e38f; // Range: ~3.4 × 10^-38 to ~3.4 × 10^38
        double doubleVar = 1.7e308; // Range: ~1.7 × 10^-308 to ~1.7 × 10^308

        // Boolean type
        boolean booleanVar = true; // Represents true or false

        // Character type
        char charVar = 'A'; // Represents a single character (unicode)

        // Non-primitive data types

        // String type
        String stringVar = "Hello"; // Represents a sequence of characters

        // Arrays
        int[] intArray = {1, 2, 3, 4, 5}; // Represents a collection of elements of the same type

        // Objects
        Object obj = new Object(); // Represents an instance of a class

        // Printing out the values of all variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("charVar: " + charVar);
        System.out.println("stringVar: " + stringVar);
        System.out.print("intArray: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();                                                                          
        System.out.println("obj: " + obj); // The default toString() method of Object prints the hashcode
    }
}
                                                                                                                                     