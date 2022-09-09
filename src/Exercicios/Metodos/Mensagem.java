package Exercicios.Metodos;

import java.util.Calendar;

public class Mensagem {
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

    }
