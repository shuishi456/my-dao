package annotation;

import java.lang.annotation.*;

/**
 * @Author lnz
 * @Date created in 2018/3/28
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    String value();
}
