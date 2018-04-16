package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author lnz
 * @Date created in 2018/3/31
 */
@TypeUse
public class TypeAnnotationTest<@TypeParameter T> {

    private List<Map<String, String>> list = new ArrayList<Map<String, String>>();
    @TypeUse
    private String test;

    public static void main(String[] args) throws Exception {
        TypeVariable<Class<TypeAnnotationTest>>[] ss = TypeAnnotationTest.class.getTypeParameters();
        // 获取泛型参数上的注解值
        System.out.println(((TypeParameter) ss[0].getDeclaredAnnotations()[0]).value());
        // 获取TypeAnnotationTest类上的注解值
        System.out.println(((TypeUse) TypeAnnotationTest.class.getAnnotations()[0]).value());
        // 获取实际泛型参数
        ParameterizedType parameterizedType = (ParameterizedType) TypeAnnotationTest.class.getDeclaredField("list").getGenericType();
        System.out.println(parameterizedType.getActualTypeArguments()[0]);
    }

}
