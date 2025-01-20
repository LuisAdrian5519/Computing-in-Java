import java.util.Scanner;

class Cabrera_a
{
	public static void main (String args[])
	{
		Scanner Teclado = new Scanner(System.in);

		int longitud;
		System.out.print("Dame la longitud del vector: ");
	    longitud = Teclado.nextInt();
		int números[]= new int[longitud];
		int i;

		for(i=0;i<números.length;i++)
		{
			System.out.print("Dame el número " +(i+1) +": ");
			números[i]=Teclado.nextInt();

		}
			for (i=0;i<números.length;i++)
		    {
			System.out.print(números[i]);

			if(números[i] % 2 == 0){
			System.out.println(" Número par");
			}

			if(números[i] % 2 != 0){
			System.out.println(" Número impar");
			}
		}
	}
}