import java.util.Scanner;

class eje1104b1
{
    public static void main (String [] args)
	{
    Scanner Teclado = new Scanner(System.in);


    int longitud=10;
    int i=0;
    int o=0;
    int [] números= new int [longitud];

    do{
    System.out.print("Dame el numero " + (i+1) +": " );
    números [i] = Teclado.nextInt();
	o= i-1;

       	while (o>0){
       	if (números [i]== números [o])
       	System.out.println("numero repetido: " + números [i] +" En posición: " + (o + 1) );
       	o--;}
       	i++;
       	}while ( i < longitud);

       	for (i=0;i<números.length;i++){
		System.out.println(números[i]);
		}
    }
}
