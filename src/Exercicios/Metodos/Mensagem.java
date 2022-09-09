package Exercicios.Metodos;

import java.util.Calendar;
import java.util.Scanner;

import static Exercicios.Metodos.meuEmprestimo.calcEmprestimo;
import static java.lang.Thread.sleep;

public class Mensagem {

        static Scanner ler= new Scanner(System.in);

        public static String horaDia() {

            int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

            if (hora < 12) {
                return "Bom dia!";
            } else if (hora < 18) {
                return "Boa tarde!";
            } else {
                return "Boa noite!";
            }
        }

        public static void chamaCalc() throws InterruptedException {

            sleep(500);

            System.out.println("Exercício 01");
            System.out.println("SISTEMA DE CALCULADORA!");
            sleep(250);

            System.out.println("Digite o primeiro valor: ");

            int valorA = ler.nextInt();
            System.out.println("Digite o segundo valor: ");
            int valorB = ler.nextInt();

            System.out.println("Digite a operação desejada: ");
            System.out.println("1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
            String op = ler.next();
            sleep(250);
            System.out.println("O resultado é: " + Calculadora.calcMath(valorA, valorB, op));

        }

        public static void chamaEmprestimo() throws InterruptedException {

            sleep(500);
            System.out.println("Exercício 01");
            System.out.println("SISTEMA DE EMPRÉSTIMO!");
            sleep(250);

            System.out.println("Digite o valor que deseja pegar: ");

            int valorPego = ler.nextInt();
            System.out.println("Digite a quantidade de parcelas: ");
            int parcelas = ler.nextInt();

            sleep(250);
            System.out.println("O valor total que irá pagar pelo empréstimo é: " + calcEmprestimo(valorPego, parcelas));

        }

}
