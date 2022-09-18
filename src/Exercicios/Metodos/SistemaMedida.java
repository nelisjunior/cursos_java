package Exercicios.Metodos;

public class SistemaMedida {
    public static void main(String[] args){
        String sigla = "M";

        switch (sigla){
            case "MM":
                System.out.println("Milimetro");
                break;
            case "CM":
                System.out.println("Centimetro");
                break;
            case "M":
                System.out.println("Metro");
                break;
            case "KM":
                System.out.println("Quilometro");
                break;
            default:
                System.out.println("Sigla inválida");
        }
    }
}
