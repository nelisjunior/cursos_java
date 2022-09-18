package Exercicios.Metodos;

public class PlanoOperadora {
    public static void main(String[] args){
        String plano = "M";

        switch (plano){
            case "P":
                System.out.println("100 minutos de ligação");
                break;
            case "M":
                System.out.println("100 minutos de ligação");
                System.out.println("Whatsapp ilimitado");
                break;
            case "G":
                System.out.println("100 minutos de ligação");
                System.out.println("Whatsapp ilimitado");
                System.out.println("Facebook ilimitado");
                System.out.println("10Gb de Internet");
                break;
            default:
                System.out.println("Plano inválido");
        }
    }
}
