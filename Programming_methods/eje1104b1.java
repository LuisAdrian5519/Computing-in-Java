import java.util.Scanner;

class eje1104b1
{
    public static void main (String [] args)
	{
    Scanner Teclado = new Scanner(System.in);


    int longitud=10;
    int i=0;
    int o=0;
    int [] n�meros= new int [longitud];

    do{
    System.out.print("Dame el numero " + (i+1) +": " );
    n�meros [i] = Teclado.nextInt();
	o= i-1;

       	while (o>0){
       	if (n�meros [i]== n�meros [o])
       	System.out.println("numero repetido: " + n�meros [i] +" En posici�n: " + (o + 1) );
       	o--;}
       	i++;
       	}while ( i < longitud);

       	for (i=0;i<n�meros.length;i++){
		System.out.println(n�meros[i]);
		}
    }
}
