package Exercicios.Metodos;

public class PlanoOperadora {
    public static void main(String[] args){
        String plano = "M";

        switch (plano) {
            case "P" -> System.out.println("100 minutos de ligação");
            case "M" -> {
                System.out.println("100 minutos de ligação");
                System.out.println("Whatsapp ilimitado");
            }
            case "G" -> {
                System.out.println("100 minutos de ligação");
                System.out.println("Whatsapp ilimitado");
                System.out.println("Facebook ilimitado");
                System.out.println("10Gb de Internet");
            }
            default -> System.out.println("Plano inválido");
        }
    }
}
