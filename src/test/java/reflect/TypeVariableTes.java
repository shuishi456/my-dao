package reflect;

import sun.applet.Main;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @Author lnz
 * @Date created in 2018/3/6
 */
public class TypeVariableTes<K extends User, V> {


    K key;
    V value;
    public static void main(String[] args) throws Exception
    {
        Type[] types = TypeVariableTes.class.getTypeParameters();
        for(Type type : types){
            TypeVariable t = (TypeVariable)type;
            System.out.println(t.getGenericDeclaration());
            int size = t.getBounds().length;
            System.out.println(t.getBounds()[size - 1]);
            System.out.println(t.getName() + "\n-------------分割线-------------");
        }
    }
}

