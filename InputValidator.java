package poo;

public class InputValidator {
    public static boolean validarNumerosPositivos(int... numeros) {
        for (int num : numeros) {
            if (num < 0) {
                return false;
            }
        }
        return true;
    }
}
