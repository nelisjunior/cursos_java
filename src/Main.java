import java.util.Scanner;

import Exercicios.Metodos.Calculadora;
import static Exercicios.Metodos.Mensagem.horaDia;
import static Exercicios.Metodos.meuEmprestimo.calcEmprestimo;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Scanner ler= new Scanner(System.in);

        int valorA, valorB;
        String op;

        int valorPego; // valor que o cliente quer pegar
        int parcelas; // Em meses

        System.out.println(horaDia());

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

}
