package kyu8.somaMultiplos;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("sumMul(2, 9) ==> " + SomadeMultiplos.sumMul(2,9));

        try {
            System.out.println("sumMul(4, -7) ==> " + SomadeMultiplos.sumMul(4, -7));
        }catch (IllegalArgumentException e) {
            System.out.println("Erro for (4 , -7): " + e.getMessage());
        }
    }
}
