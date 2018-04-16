package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;

/**
 * @Author lnz
 * @Date created in 2018/3/29
 */
public class Man extends User {
    /**
     * 性别
     */
    private int sex;

    public static void main(String[] args) {
        Class manClass = Man.class;
        Table table = (Table)manClass.getAnnotation(Table.class);
        System.out.println(manClass.isAnnotationPresent(Table.class));
        System.out.println(manClass.getAnnotation(Table.class));
    }
}
