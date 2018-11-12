import java.util.Scanner;

public class Pedirnombre{
public void Pedirnombre(String nombre){

	Scanner pedir = new Scanner(System.in);
	Persona per = new Persona();

	System.out.println("Ingrese su nombre");
	nombre = pedir.next();

	per.setNombre(nombre);

	System.out.println(per.getNombre());

}
}