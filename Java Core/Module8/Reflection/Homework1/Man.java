package Module8.Reflection.Homework1;

import java.util.Arrays;

public class Man {
    public int a = 1;
    private int b = 2;
    private int c = 3;

    public void d(){
        System.out.println("d");
    }

    private void e(){
        System.out.println("e");
    }

    private void f(){
        System.out.println("f");
    }

    String getReflectionInfo(){
        Class<? extends Man> man = this.getClass();
        StringBuilder result = new StringBuilder();
        result.append("Fields:\n");
        result.append(Arrays.toString(man.getFields()));
        result.append("\n");
        result.append("Methods:\n");
        result.append(Arrays.toString(man.getMethods()));
        result.append("\n");
        result.append("Class:\n");
        result.append(man.getName());
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Man().getReflectionInfo());
    }
}
