
import java.util.Scanner;

class m041144101401    //Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla? Recuerde que por Pitágoras se tiene que: C2 = A2 + B2.
{
	public static void main ( String args [] )
	{
		Scanner Teclado = new Scanner(System.in);

		int Cateto1;

		System.out.print("Dame el cateto 1:");
		Cateto1 = Teclado.nextInt();

		int Cateto2;

		System.out.print("Dame el cateto 2:");
		Cateto2 = Teclado.nextInt();

		System.out.println(Math.sqrt(Cateto1*Cateto1 + Cateto2*Cateto2));

	 }

 }