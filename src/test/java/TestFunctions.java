import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestFunctions {
    public static final double EPSILON = 0.0001;

    private double inputX;
    private double expectedResult;
    private Functions functions;

    @Before
    public void initialize() {
        functions = new Functions();
    }

    public TestFunctions(double inputX, double expectedResult) {
        this.inputX = inputX;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "{index}: X = {0}")
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                { Double.NaN, Double.NaN },
                { 0d, 1d },
                { 2*PI, 1d },
                { -2*PI, 1d },
                { -PI, -1d },
                { PI, -1d },
                { PI/2, 0d },
                { -PI/2, 0d },
                { -5*PI/2, 0d },
                { 5*PI/2, 0d },
                { PI/4, 0.707107 },
                { -PI/4, 0.707107 },
                { 3*PI/4, -0.707107 },
                { 3*PI/4, -0.707107 }
        });
    }

    @Test
    public void testCos() {
        assertEquals(expectedResult, functions.cos(inputX), EPSILON);
    }
}
