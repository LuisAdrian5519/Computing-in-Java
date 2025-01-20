import java.util.Scanner;

class Serie_de_Fibonacci
{
	public static void SOP (String cadena)
	{
		System.out.print(cadena);
	}
	public static void SOPln (String cadena)
	{
		System.out.println(cadena);
	}

	public static void main (String args[])
	{

	Scanner Teclado = new Scanner(System.in);

	int a=0;
	int b=0;
	int c=0;
	int i=3;
	int n=0;
	int v=0;

	do {
	SOP("Dame el valor inicial de la serie: ");
	a = Teclado.nextInt();
	} while (a<0 || a>100);

	do {
	SOP("Dame el segundo valor de la serie: ");
	b = Teclado.nextInt();
	} while (b<=a || b>100);

	do {
	SOP("¿Cuántos números de la serie quieres? ");
	n = Teclado.nextInt();
	} while (n>100);

	do {
	SOP("¿Cuál es el valor máximo que quieres que alcance la serie? ");
	v = Teclado.nextInt();
	} while (v > 100000);

	SOPln("1: " +a);
	SOPln("2: " +b);

	do
	{
	c= a + b;
	SOPln(i +": " +c);
	a=b;
	b=c;
	i++;
	} while (i <= n && c <= (v-a));

	}
}