package Exercicios.Metodos;

public class ResultadoEscolar {

    public static void main(String[] args){
        int nota = 6;

        if(nota >= 7)
            System.out.println("Alun@ aprovad@!");

        else if (nota >= 5 && nota < 7)
            System.out.println("Aun@ está em recuperação!");

        else
            System.out.println("Alun@ reprovado!");
    }
}
