import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CustomMathTest {

    private int x;
    private int y;
    private int sumResult;

    public CustomMathTest(int x, int y, int sumResult) {
        this.x = x;
        this.y = y;
        this.sumResult = sumResult;
    }

    @Parameterized.Parameters
    public static Collection sumValues() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {-1, 1, 0},
                {10, 15, 25},
        });
    }

    @Test
    public void test() {
        int expResult = sumResult;
        int result = Main.sum(x, y);

        Assert.assertEquals(expResult, result);
    }
}
