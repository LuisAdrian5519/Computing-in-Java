import java.util.Scanner;

class Serie_de_Fibonacci_inversa
{

	public static void main (String args[])
	{
	Scanner Teclado = new Scanner(System.in);

	int a=0;
	int b=0;
	int c=0;
	int i=2;
	int Máximo;
	int Repeticiones;


	do {
	System.out.print("Dame el valor inicial de la serie: ");
	a = Teclado.nextInt();
	} while (a<0 || a>100);

	do {
	System.out.print("Dame el segundo valor de la serie: ");
	b = Teclado.nextInt();
	} while (b<=a || b>100);

	do {
	System.out.print("¿Cuántos números de la serie quieres? ");
	Repeticiones = Teclado.nextInt();
	} while (Repeticiones>100);

	do {
	System.out.print("¿Cuál es el valor máximo que quieres que alcance la serie? ");
	Máximo = Teclado.nextInt();
	} while (Máximo > 10000);

	int[] vector =new int [Repeticiones];

	vector [0]=a;
	vector [1]=b;

	while (i<Repeticiones & c<=Máximo){
	c= a + b;
	vector [i]=c;
	a=b;
	b=c;
	i++;
	}

	for (i=Repeticiones-1 || c<=máximo ;i>=0;i--){

	System.out.println(i+1 +":" +vector [i]);

	}

	}
}