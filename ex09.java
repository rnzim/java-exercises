import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Calculadora De Tempo");
		Scanner sc = new Scanner(System.in);
		System.out.println("Que Horas Começou O Jogo");
		int hourInit = sc.nextInt();
    System.out.println("Que Horas Começou O Jogo");
    int hourFinal = sc.nextInt();
		int result = 0 ;
		if (hourInit < hourFinal){
		    result = hourFinal-hourInit;

		}else if(hourInit > hourFinal){
		   result = (hourInit-hourFinal-24)*(-1);
		}else if(hourInit == hourFinal){
		      result = 24;
		    }
		
		System.out.println("Durou: " + result + " Horas");
	}
}
