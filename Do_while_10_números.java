import java.util.Scanner;

class Do_while_10_números
{

	public static Scanner Teclado = new Scanner(System.in);

	public static void main (String args [])
	{
		float número = 0;
		float sumatoria = 0;
		float promedio = 0;

		int contador = 0;

		do { contador++;
		System.out.print ("Dame el número " + contador + ":");
		número = Teclado.nextFloat();
		sumatoria+=número;  //sumatoria =sumatoria+número
		} while (contador<10);

		promedio =sumatoria/10;

		System.out.println ("La sumatoria es:" + sumatoria);
		System.out.println ("El promedio es:" + promedio);

	}
}
