import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {
    MyArrayList<String> strings;

    @Before
    public void init() {
        strings = new MyArrayList<>();
    }

    @Test
    public void test_whenPutElement_thenAssertElementInList() {
        strings.put("Element");
        Assert.assertEquals("Element", strings.get(0));
    }

    @Test
    public void anotherTest_whenPutElementInEmpty_thenAssertElementNotInSecondIndex() {
        strings.put("Joke");
        Assert.assertNotEquals("Joke", strings.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_whenGetNegativeIndex_thenThrowException() {
        strings.get(-1);
    }

    @Test
    public void test_whenDeleteZeroIndex_ThenSizeDecreased() {
        strings.put("Element1");
        strings.put("Element2");
        strings.delete(0);
        int expectedSize = 1;
        int actualSize = strings.getSize();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void test_whenPutFirst_thenAddedElementInZeroIndex() {
        strings.putFirst("Hello");
        Assert.assertEquals("Hello", strings.get(0));
    }

    @Test
    public void test_whenPutFirst_thenSizeIncremented() {
        strings.putFirst("Hello");
        Assert.assertEquals(1, strings.getSize());
    }
}
