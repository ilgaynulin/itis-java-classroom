import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class FactorialTest {
    Factorial factorial;

    @Before
    public void init() {
        factorial = new FactorialImpl();
    }

    @Test
    public void factorial_whenInvokeZero_thenReturnOne() {
        Assert.assertEquals(1, factorial.compute(0));
    }

    @Test
    public void factorial_whenInvokeOne_thenReturnOne() {
        Assert.assertEquals(1, factorial.compute(1));
    }

    @Test
    public void factorial_whenInvokeTwo_thenReturnTwo() {
        Assert.assertEquals(2, factorial.compute(2));
    }

}