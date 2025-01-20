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
		int números1[]= new int[longitud1];
		for(i1=0;i1<números1.length;i1++)
		{
			System.out.print("Dame el número " +(i1+1) +": ");
			números1[i1]=Teclado.nextInt();
		}


		System.out.print("Dame la longitud del segundo vector: ");
		longitud2 = Teclado.nextInt();
		int números2[]= new int[longitud2];
		for(i2=0;i2<números2.length;i2++)
		{
			System.out.print("Dame el número " +(i2+1) +": ");
			números2[i2]=Teclado.nextInt();
		}

		int suma[]= new int[(longitud1*longitud2)];
		System.out.println ("La suma cruzada es:");

		for (a=0;a<suma.length;a++){
		for (o=0;o<números2.length;o++)
			{
				suma[i]=números1[a]+números2[o];
				System.out.print((i+1) +". ");
				System.out.print(números1[a] +" +");
				System.out.print(" " +números2[o] +": ");
				System.out.println(suma[i]);
				i++;
			}
		}
	}
}

