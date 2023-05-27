public class FactorialImpl implements Factorial {
    @Override
    public int compute(int f) {
        int result = 2;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
