package Module8.Annotation.Homework2;

public class AnnotationTest {

    @Deprecated
    public String old() {
        return "old";
    }
}

class CallOld{

    @SuppressWarnings("deprecation")
    void call(){
        System.out.println(new AnnotationTest().old());
    }

    public static void main(String[] args) {
        new CallOld().call();
    }
}
