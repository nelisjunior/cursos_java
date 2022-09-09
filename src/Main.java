import java.util.Scanner;

import Exercicios.Metodos.Calculadora;
import Exercicios.Metodos.Quadrilatero;

import static Exercicios.Metodos.Mensagem.horaDia;
import static Exercicios.Metodos.meuEmprestimo.calcEmprestimo;
import static java.lang.Thread.sleep;


public class Main {

    static Scanner ler= new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        int n;

        System.out.println(horaDia());

        sleep(1000);

        System.out.println("BEM VINDO!");
        sleep(500);

        System.out.println("Escolha uma das opções:");
        sleep(500);
        System.out.println("(1) Exercício 1\n(2) Exercício 2");
        n = ler.nextInt();
        sleep(500);

        //listagem dos métodos existentes
        switch (n) {
            case 1 -> chamaExercicio01();
            case 2 -> chamaExercicio02();
            default -> {
                System.out.println("Opção inválida!");
                sleep(1000);
                System.out.println("Encerrando...");
                sleep(1000);
                System.out.println("Fim do programa!");
            }
        }


    }

    public static void chamaExercicio01() throws InterruptedException {

        int valorA, valorB;
        String op;

        int valorPego; // valor que o cliente quer pegar
        int parcelas; // Em meses

        sleep(1000);

        System.out.println("BEM VINDO AO SISTEMA DE CALCULADORA!");
        sleep(500);

        System.out.println("Digite o primeiro valor: ");
        valorA = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        valorB = ler.nextInt();

        System.out.println("Digite a operação desejada: ");
        System.out.println("1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
        op = ler.next();
        sleep(500);
        System.out.println("O resultado é: " + Calculadora.calcMath(valorA, valorB, op));

        sleep(1000);
        System.out.println("BEM VINDO AO SISTEMA DE EMPRÉSTIMO!");
        sleep(500);

        System.out.println("Digite o valor que deseja pegar: ");
        valorPego = ler.nextInt();
        System.out.println("Digite a quantidade de parcelas: ");
        parcelas = ler.nextInt();

        sleep(500);
        System.out.println("O valor total que irá pagar pelo empréstimo é: " + calcEmprestimo(valorPego, parcelas));

    }

    public static void chamaExercicio02() throws InterruptedException {

        sleep(1000);
        System.out.println("BEM VINDO!");
        sleep(500);
        System.out.println("Conheça os métodos aprendidos no exerício 02 do curso de Java!");
        sleep(500);

        Quadrilatero.calcArea(5);
        Quadrilatero.calcArea(5d, 10d);
        Quadrilatero.calcArea(5, 10, 15);
        Quadrilatero.calcArea(5f, 10f);

    }


}
