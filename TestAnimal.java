import java.util.*;
public class TestAnimal{
	public static void main(String[] args){
	Animal animal1=new Animal();
	Scanner teclado=new Scanner(System.in);
	System.out.print("Tecle el Nombre del Animal: ");
	animal1.setNombre(teclado.nextLine());
	System.out.print("Tecle la edad del animal: ");
	int edad=teclado.nextInt();
	animal1.setEdad(edad);
	animal1.nace();
	System.out.println("Me llamo"+animal1.get.Nombre() +
	"y tengo" + animal1.getEdad() + "años");
	}
}
