class HomeWork {
    public static int staticField;
    final static int finalStaticField = 2; // final field must be initialized when created
    int instanceField;

    public void printStaticFields() {
        System.out.println("staticField: " + staticField + "\nfinalStaticField: " + finalStaticField);
    }

    public void addOneToStaticFields() {
        staticField += 1;
        // Cannot assign a value to a final field
        //finalStaticField += 1;
    }
    public void addNumberToInstanceField(int numberToAdd) {
        instanceField += numberToAdd;
    }
}


class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers with new operator
        anArray = new int[10];

        System.out.println(anArray[2] + "\n");
        for (int i = 0; i < 10; i++) {
            anArray[i] = i;
            System.out.println(anArray[i]);
        }

        // Similarly for other default data types
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        // Multidimensional String array
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms Jones
        System.out.println(names[0][2] + names[1][1]);

        // Built in length property
        System.out.println(names.length);
        System.out.println(names[0].length);

        // Copying of array
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"
        };

        String[] copyTo = new String[7];

        // Array to copy from, index to start copy from, array copy to, index to start copy to, index to end exclusively
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.print("\n");
        // toString - converts each element to string, separates with commas, surrounds it with brackets
        System.out.print(java.util.Arrays.toString(copyTo) + '\n');
        // toString is not recursive
        System.out.print(java.util.Arrays.toString(names) + '\n');
        System.out.println(java.util.Arrays.toString(names[0]) + java.util.Arrays.toString(names[1]) + '\n');

        HomeWork homework = new HomeWork();
        System.out.println(homework.instanceField);
        homework.printStaticFields();
        homework.addOneToStaticFields();
        homework.printStaticFields();
        homework.addNumberToInstanceField(123);
        System.out.println(homework.instanceField);
    }
}