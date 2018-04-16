package annotation;

import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.annotation.Order;

import java.util.Set;

/**
 * @Author lnz
 * @Date created in 2018/4/12
 */
public class SpringAnnotationUtilTest {

    public static void main(String[] args) {
        // 查找类上的annotation注解，会一直找到注解上
        Column column = AnnotationUtils.findAnnotation(User.class, Column.class);

        Table table = AnnotationUtils.findAnnotation(User.class, Table.class);

        Set<String> set =  AnnotatedElementUtils.getMetaAnnotationTypes(Table.class, Order.class);

        Set<String> set2 = AnnotatedElementUtils.getMetaAnnotationTypes(Table.class,"Order");

        //AnnotatedElementUtils.isAnnotated(User.class, Table.class);

        //AnnotationUtils.getAnnotationAttributes(Annotation)
    }
}
