package Exercicios.Metodos;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos
 * SOBRECARGAS
 */
public class Quadrilatero {

    public static double calcArea(double lado) {

        return (lado * lado);
    }

    public static double calcArea(double lado1, double lado2) {

        return (lado1 * lado2);
    }

    public static double calcArea(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static double calcArea(float diagonal, float diagonal2) {

        return (diagonal * diagonal2) / 2;
    }

}
