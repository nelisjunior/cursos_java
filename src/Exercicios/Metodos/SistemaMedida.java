package Exercicios.Metodos;

public class SistemaMedida {
    public static void main(String[] args){
        String sigla = "M";

        switch (sigla) {
            case "MM" -> System.out.println("Milimetro");
            case "CM" -> System.out.println("Centimetro");
            case "M" -> System.out.println("Metro");
            case "KM" -> System.out.println("Quilometro");
            default -> System.out.println("Sigla inválida");
        }
    }
}
