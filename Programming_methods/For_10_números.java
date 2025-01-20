import java.util.Scanner;

class For_10_números
{
	public static void SOP (String cadena)
	{
		System.out.print(cadena);
	}
	public static void SOPln (String cadena)
	{
		System.out.println(cadena);
	}

	public static Scanner Teclado = new Scanner(System.in);

	public static void main (String args [])
	{
		float número = 0;
		float sumatoria = 0;
		float promedio = 0;

		int contador = 0;

		for(contador=1;contador<=10;contador++)
		{
			System.out.print ("Dame el número " + contador + ":");
			número = Teclado.nextFloat();
			sumatoria+=número;  //sumatoria =sumatoria+número
		}
		promedio =sumatoria/10;

		System.out.println ("La sumatoria es:" + sumatoria);
		System.out.println ("El promedio es:" + promedio);

	}
}