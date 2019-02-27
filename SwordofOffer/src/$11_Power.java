public class $11_Power {
    public double Power(double base, int exponent) {
        int exp = exponent;
        if (Math.abs(base) < 0.00001 && exponent <= 0) //base为0 指数是负数，抛出意外
            throw new RuntimeException("分母不能为0"); 
        else if (exponent < 0) exp = -exponent;
        double result = 1;
        // 快速幂，每次先平方，有1的时候乘以base
        while (exp > 0) {
            result = result * result;
            if ((exp & 1) == 1) result = result * base;
            exp = exp >> 1;
        }
        return exponent>=0?result:1/result;
        
  }
}