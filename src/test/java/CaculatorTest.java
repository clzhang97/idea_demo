import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaculatorTest {
    @Test
    public void shouldReturn2When1Plus1() {
        Caculator caculator = new Caculator();

        int actualResult = caculator.compute(1, 1, '+');
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);

    }

}