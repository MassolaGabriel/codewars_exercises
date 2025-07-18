package kyu8.somaMultiplos;

public class SomadeMultiplos {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("O valor N e M deve ser maior que 0");
        }

        long sum = 0;

        for (int i = n; i <= m; i += n) {
            sum += i;
        }
        return sum;
    }
}
