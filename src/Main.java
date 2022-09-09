import java.util.Scanner;

import Exercicios.Metodos.Mensagem;
import Exercicios.Metodos.Quadrilatero;

import static Exercicios.Metodos.Mensagem.horaDia;
import static java.lang.Thread.sleep;

public class Main {

    static Scanner ler= new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        int n;

        System.out.println(horaDia());

        sleep(500);

        System.out.println("BEM VINDO!");
        sleep(250);

        System.out.println("Escolha uma das opções:");
        sleep(250);
        System.out.println("(1) Exercício 1\n(2) Exercício 2\n(3) Exercício 3");
        n = ler.nextInt();
        sleep(250);

        //listagem dos métodos existentes
        switch (n) {
            case 1 -> chamaExercicio01();
            case 2 -> chamaExercicio02();
            case 3 -> chamaExercicio03();
            default -> {
                System.out.println("Opção inválida!");
                sleep(500);
                System.out.println("Encerrando...");
                sleep(500);
                System.out.println("Fim do programa!");
            }
        }
    }

    public static void chamaExercicio01() throws InterruptedException {


        System.out.println("Escolha o método que deseja utilizar: ");
        System.out.println("(1) Calculadora\n(2) Empréstimo");
        int n = ler.nextInt();

        //listagem dos métodos existentes
        switch (n) {

            case 1 -> Mensagem.chamaCalc();
            case 2 -> Mensagem.chamaEmprestimo();
            default -> {
                System.out.println("Opção inválida!");
                sleep(500);
                System.out.println("Encerrando...");
                sleep(500);
                System.out.println("Fim do programa!");
            }
        }
    }

    public static void chamaExercicio02() throws InterruptedException {

        sleep(501);
        System.out.println("Exercício 02");
        sleep(251);
        System.out.println("Conheça os métodos aprendidos no exerício 02 do curso de Java!");
        sleep(250);

        System.out.println("A área do quadrado é: " + Quadrilatero.calcArea(5));
        System.out.println("A área do retângulo é: " + Quadrilatero.calcArea(5d, 10d));
        System.out.println("A área do triângulo é: " + Quadrilatero.calcArea(5d, 10d, 15d));
        System.out.println("A área do trapézio é: " + Quadrilatero.calcArea(5f, 10f));

    }

    public static void chamaExercicio03() throws InterruptedException {

        sleep(500);
        System.out.println("Exercício 03");
        sleep(250);
        System.out.println("Conheça os métodos aprendidos no exerício 03 do curso de Java!");
        sleep(500);

        System.out.println("Escolha o método da figura geométrica deseja calcular: ");
        System.out.println("(1) Quadrado\n(2) Retângulo\n(3) Triângulo\n(4) Trapézio");
        int n = ler.nextInt();

        double areaQuadrad = Quadrilatero.calcArea(5);
        double areaRetang = Quadrilatero.calcArea(5d, 10d);
        double areaTriang = Quadrilatero.calcArea(5, 10, 15);
        double areaTrap = Quadrilatero.calcArea(5f, 10f);

        //listagem dos métodos existentes
        switch (n) {

            case 1 -> System.out.println("A área do quadrado é: " + areaQuadrad);
            case 2 -> System.out.println("A área do retângulo é: " + areaRetang);
            case 3 -> System.out.println("A área do triângulo é: " + areaTriang);
            case 4 -> System.out.println("A área do trapézio é: " + areaTrap);

            default -> {
                System.out.println("Opção inválida!");
                sleep(500);
                System.out.println("Encerrando...");
                sleep(500);
                System.out.println("Fim do programa!");
            }
        }
    }

}
