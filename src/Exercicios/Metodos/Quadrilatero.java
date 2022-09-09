package Exercicios.Metodos;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos
 * SOBRECARGAS
 */
public class Quadrilatero {

    public static void calcArea(double lado) {

        System.out.println("A área do quadrado é: " + lado * lado);
    }

    public static void calcArea(double lado1, double lado2) {

        System.out.println("A área do retângulo é: " + lado1 * lado2);
    }

    public static void calcArea(double baseMaior, double baseMenor, double altura) {

        System.out.println("A área do trapézio é: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void calcArea(float diagonal, float diagonal2) {

        System.out.println("A área do losango é: " + (diagonal * diagonal2) / 2);
    }

}
