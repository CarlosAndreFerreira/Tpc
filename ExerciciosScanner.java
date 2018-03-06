import java.util.Calendar;
import java.util.Scanner;

public class ExerciciosScanner {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insira a sua idade: ");
		
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("Nasceu no ano de: " + (calendario.get(Calendar.YEAR)- in.nextInt()));
		
	}

}
