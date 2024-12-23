package Compare_Strings_by_Sum_of_Chars;


public class Kata {
    public static boolean compare(String s1, String s2) {
        int sum1 = getSum(s1);
        int sum2 = getSum(s2);
        return sum1 == sum2;
    }

    public static int getSum(String s) {
        if (s == null) {
            return 0;
        } else {
            char[] upper = s.toUpperCase().toCharArray();
            int sum = 0;
            if (s.matches("[a-zA-Z]*")) {
                for (int i = 0; i < upper.length; i++) {
                    sum += upper[i];
                }
            } else {
                sum = 0;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(compare("zzz1", ""));
        System.out.println(compare("asdf", "ASDF"));
        System.out.println(compare("sdf", "ASDF"));
    }
}
