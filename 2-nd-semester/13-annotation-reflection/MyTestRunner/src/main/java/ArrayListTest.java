import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    @MyTest
    public void testAdd_whenAddElement_thenItOnZeroIndex() {
        List<String> strings = new ArrayList<>();
        strings.add("Element");
        assertEquals("El", strings.get(0));
    }

    @MyTest
    public void test_alwaysFail() {
        throw new RuntimeException("Хаха");
    }

    public void print() {
        System.out.println("Хаха");
    }


    public void assertEquals(Object first, Object second) {
        if(!first.equals(second)) {
            throw new RuntimeException("Объекты не равны");
        }
    }
}
