import java.util.Scanner;

class m0411441026a
{
	public static Scanner Teclado = new Scanner(System.in);

	public static void main (String args[])
	{
		float n�mero=0;
		float sumatoria=0;
		float promedio=0;
		int contador=1;

		while (contador>=1 && n�mero!=0)
		{
			System.out.print("Dame el n�mero "+contador+":");
			n�mero=Teclado.nextFloat();
			sumatoria+=n�mero;
			contador++;
		}
		promedio=sumatoria/(contador-1);

		System.out.println("La sumatoria es:"+sumatoria);
		System.out.println("El promedio es:"+promedio);

	}
}