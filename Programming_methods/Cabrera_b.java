import java.util.Scanner;

class Cabrera_b
{
	public static void main (String args[])
	{
		Scanner Teclado = new Scanner(System.in);

		int longitud1;
		int longitud2;
		int i1;
		int i2;
		int a=0;
		int o=0;
		int i=0;
		System.out.print("Dame la longitud del primer vector: ");
		longitud1 = Teclado.nextInt();
		int n�meros1[]= new int[longitud1];
		for(i1=0;i1<n�meros1.length;i1++)
		{
			System.out.print("Dame el n�mero " +(i1+1) +": ");
			n�meros1[i1]=Teclado.nextInt();
		}


		System.out.print("Dame la longitud del segundo vector: ");
		longitud2 = Teclado.nextInt();
		int n�meros2[]= new int[longitud2];
		for(i2=0;i2<n�meros2.length;i2++)
		{
			System.out.print("Dame el n�mero " +(i2+1) +": ");
			n�meros2[i2]=Teclado.nextInt();
		}

		int suma[]= new int[(longitud1*longitud2)];
		System.out.println ("La suma cruzada es:");

		for (a=0;a<suma.length;a++){
		for (o=0;o<n�meros2.length;o++)
			{
				suma[i]=n�meros1[a]+n�meros2[o];
				System.out.print((i+1) +". ");
				System.out.print(n�meros1[a] +" +");
				System.out.print(" " +n�meros2[o] +": ");
				System.out.println(suma[i]);
				i++;
			}
		}
	}
}

