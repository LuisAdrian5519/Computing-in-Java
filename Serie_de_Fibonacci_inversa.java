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
	int M�ximo;
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
	System.out.print("�Cu�ntos n�meros de la serie quieres? ");
	Repeticiones = Teclado.nextInt();
	} while (Repeticiones>100);

	do {
	System.out.print("�Cu�l es el valor m�ximo que quieres que alcance la serie? ");
	M�ximo = Teclado.nextInt();
	} while (M�ximo > 10000);

	int[] vector =new int [Repeticiones];

	vector [0]=a;
	vector [1]=b;

	while (i<Repeticiones & c<=M�ximo){
	c= a + b;
	vector [i]=c;
	a=b;
	b=c;
	i++;
	}

	for (i=Repeticiones-1 || c<=m�ximo ;i>=0;i--){

	System.out.println(i+1 +":" +vector [i]);

	}

	}
}