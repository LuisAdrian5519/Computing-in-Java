import java.util.Scanner;

class Cabrera_a
{
	public static void main (String args[])
	{
		Scanner Teclado = new Scanner(System.in);

		int longitud;
		System.out.print("Dame la longitud del vector: ");
	    longitud = Teclado.nextInt();
		int n�meros[]= new int[longitud];
		int i;

		for(i=0;i<n�meros.length;i++)
		{
			System.out.print("Dame el n�mero " +(i+1) +": ");
			n�meros[i]=Teclado.nextInt();

		}
			for (i=0;i<n�meros.length;i++)
		    {
			System.out.print(n�meros[i]);

			if(n�meros[i] % 2 == 0){
			System.out.println(" N�mero par");
			}

			if(n�meros[i] % 2 != 0){
			System.out.println(" N�mero impar");
			}
		}
	}
}