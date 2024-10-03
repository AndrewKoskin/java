class Expressions {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if (a == b) {
            System.out.println("a ravno b");
        } else {
            System.out.println("a ne ravno b");
        }
        // Do this
        int c = a + (b / 2);
        // Not this
        int d = a + b / 2;
    }
}