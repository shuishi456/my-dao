package annotation;

/**
 * 测试AnnotationElement
 *
 * @Author lnz
 * @Date created in 2018/4/3
 */
public class AnnotationElementTest {


    public static void main(String[] args) {
        User user = new User();
        User.class.getAnnotation(Table.class);
    }

}



