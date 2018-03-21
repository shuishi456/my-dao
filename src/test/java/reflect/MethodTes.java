package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author lnz
 * @Date created in 2018/3/5
 */
public class MethodTes {

    public static void main(String[] args) throws Exception {
        User user = new User();
        Method method = user.getClass().getDeclaredMethod("test", null);
        //method.setAccessible(true);
        method.invoke(user, null);
        System.out.println(method);

        Type[] types = ((ParameterizedType)user.getClass().getGenericSuperclass()).getActualTypeArguments();
    }

}
