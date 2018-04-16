package annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * entity与表信息对应注解
 *
 * @Author lnz
 * @Date created in 2018/3/25
 */
@Documented
@Inherited
@Order
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {
    /**
     * 表名
     */
    String tableName() default "";

    /**
     * id字段名
     */
    String id() default "id";
}
