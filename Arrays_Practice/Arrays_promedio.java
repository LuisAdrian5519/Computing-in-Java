import java.util.Scanner;

class Arrays_promedio
{
	public static void main (String args[])
	{

	int [] n�meros = {5,7,9,4,8,6,5,1,2,3};
	int resultado=0;
	int i;

	for (i=0;i<n�meros.length;++i)
	{
		System.out.print(i +": ");
		System.out.println(n�meros[i]);
		resultado += n�meros[i];
	}

	System.out.println("La media es: "+resultado/10);

	}
}