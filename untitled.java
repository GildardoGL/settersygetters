import java.util.ArrayList;
import java.util.Scanner;

public class EjemploArraylist{

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();

		String nombre;

		while(afirmacion != 2){
		System.out.println("Ingrese un nombre: ");
		nombre = scan.nextLine();
		
		lista.add(nombre);

		System.out.println("Quiere salir e imprimir los nombre ingresados?");
		System.out.println("1.Si");
		System.out.println("2.No");
		afirmacion = scan.nextLine();
		}
	}
}