import java.lang.reflect.Field;


public class Capitalconv {

    public static void capitalizeString(Object object) throws IllegalAccessException {
        Class<?> objectClass = object.getClass();
        String temp = new String();
        for (Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Capital.class)) {
                Capital addDate = field.getAnnotation(Capital.class);
                if (addDate.capital())
                    temp = field.get(object).toString();
                    field.set(object, temp.substring(0, 1).toUpperCase() + temp.substring(1));
            }
        }
    }
}