package Exercicios.Metodos;

public class Calculadora {

    //Selecionar o método que deseja utilizar
    public static double calcMath(double a, double b, String op) {

        return switch (op) {
            case "1" -> soma((int) a, (int) b);
            case "2" -> sub((int) a, (int) b);
            case "3" -> mult((int) a, (int) b);
            case "4" -> div((int) a, (int) b);
            default -> 0;
        };
    }

    // Crie um método para soma
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    // Crie um método para subtração
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    // Crie um método para multiplicação
    public static int mult(int num1, int num2) {
        return num1 * num2;
    }

    // Crie um método para divisão
    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    // Crie um método para calcular o resto da divisão
    public static int resto(int num1, int num2) {
        return num1 % num2;
    }

    // Crie um método para calcular a potência
    public static int pot(int num1, int num2) {
        int resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado = resultado * num1;
        }
        return resultado;
    }

    // Crie um método para calcular a raiz quadrada
    public static double raiz(int num1) {
        return Math.sqrt(num1);
    }

    // Crie um método para calcular a raiz cúbica
    public static double raizCubica(int num1) {
        return Math.cbrt(num1);
    }

    // Crie um método para calcular o fatorial
    public static int fatorial(int num1) {
        int resultado = 1;
        for (int i = 1; i <= num1; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    // Crie um método para calcular a média
    public static double media(double num1, double num2) {
        return (num1 + num2) / 2;
    }

}
