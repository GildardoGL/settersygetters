public class Persona{
	
	protected static String Nombre;
	protected static String Sexo;
	protected static int Edad;

	public Persona(){
	}

	public Persona(String Nombre, String Apellido, String Sexo, int Edad){

		this.Nombre = Nombre;
		this.Sexo = Sexo;
		this.Edad = Edad;

	}

	public void setNombre(String Nombre){
		this.Nombre = Nombre;

	}

	public void setSexo(String Sexo){
		this.Sexo = Sexo;

	}

	public void setEdad(int Edad){
		this.Edad = Edad;

	}
	public String getNombre(){
		return Nombre;
	}

}