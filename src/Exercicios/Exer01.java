/*  1 - Construir um programa para mostrar a data do sistema escrita por extenso usando as classes discutidas e testando as demais formas, como por exemplo: 
Hoje é quinta-feira, dia 30 de março de 2023 e agora são 20 horas e 32 minutos.
Deve ser construída uma classe e um método para retornar a data nesse formato.            */


package Exercicios;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Exer01 {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		Calendar hoje = Calendar.getInstance();
		int mes = hoje.get(Calendar.MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		mes++;
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		Date data1 = new Date();
		System.out.println("Hoje é " + df4.format(data1) + " e agora são "+ hora + " horas e "+ minutos + " minutos");
		
	}

}

	