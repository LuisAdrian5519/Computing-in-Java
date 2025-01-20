import java.util.Scanner;

class m0411441026b
{
	public static Scanner Teclado = new Scanner(System.in);

	public static void main (String args[])
	{
		float número=1;
		float sumatoria=0;
		float promedio=0;
		int contador=0;

		do{contador++;

		System.out.print("Dame el número "+contador+":");
		número=Teclado.nextFloat();
		sumatoria+=número;

		}while (contador>=1 && número!=0);

		promedio=sumatoria/contador;

		System.out.println("La sumatoria es:"+sumatoria);
		System.out.println("El promedio es:"+promedio);

	}
}