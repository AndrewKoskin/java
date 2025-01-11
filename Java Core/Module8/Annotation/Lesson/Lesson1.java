package Module8.Annotation.Lesson;

import java.lang.annotation.*;
import java.util.Arrays;

@XmlAttribute(name="attr")
@XmlElement(name="elem")
public class Lesson1 {
    public static void main(String[] args) throws NoSuchFieldException {
        Lesson1 l = new Lesson1();
        Class<? extends Lesson1> c = l.getClass();
        System.out.println(Arrays.toString(c.getDeclaredAnnotations()));
        System.out.println(Arrays.toString(c.getAnnotationsByType(XmlAttribute.class)));
        System.out.println(c.getDeclaredAnnotation(XmlElement.class));
        XmlElement x = c.getAnnotation(XmlElement.class);
        System.out.println(x.name());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface XmlAttribute {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface XmlElement {
    String name();
}
