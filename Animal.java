//Definicion de la clase animal
	public class Animal{
		private String nombre;
		private int edad;

	public void nace(){
		System.out.print("Hola, he nacido. ");
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(int edad){
		this.edad=edad;
	}
	}