import java.math.BigDecimal;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Functions {

    public double cos(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }

        x = x % (2*PI);

        double result = 0d;
        for (int n = 0; n < 15; n++) {
            result += pow(-1, n) * pow(x, 2*n) / factorial(2*n);
            System.out.println(result);
        }
        return result;
    }

    public long factorial(int n) {
        long fact = 1;
        for (long i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
