package Exercicios.Metodos;

public class meuEmprestimo {

    public static double calcEmprestimo(int valorPego, int parcelas) {
        double juros = 0;
        if (parcelas <= 12) {
            juros = 0.1;
        } else if (parcelas <= 24) {
            juros = 0.2;
        } else {
            juros = 0.3;
        }

        return valorPego * (1 + juros);
    }

}
