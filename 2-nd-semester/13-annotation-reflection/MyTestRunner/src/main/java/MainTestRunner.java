import javax.swing.plaf.metal.MetalToggleButtonUI;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTestRunner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class[] testClasses = {ArrayListTest.class};

        for(Class clazz : testClasses) {
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Получаем все публичные методы, которые аннотированы аннотацией MyTest
            Method[] methods = clazz.getMethods();
            System.out.println("Найденные методы: " + Arrays.toString(methods));
            List<Method> methodsWithMyTestAnno = Arrays.stream(methods)
                    .filter(m -> m.getAnnotation(MyTest.class) != null)
                    .collect(Collectors.toList());

            // Найденные тесты (методы с аннотацией) запускаем
            for(Method m : methodsWithMyTestAnno) {
                try{
                    m.invoke(obj);
                    System.out.println("Тест " + m.getName() + " прошёл успешно");
                } catch (Exception e) {
                    System.out.println("Тест " + m.getName() + "  провалился с ошибкой: " + e.getCause().getMessage());
                }
            }
        }
    }
}
