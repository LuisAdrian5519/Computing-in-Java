import java.util.Scanner;
public class eje1104b
{
     public static void main (String [] args)
     {
     Scanner Teclado = new Scanner (System.in);

	int i=1;
	int o=10;
	int io=0;
    int [] n�meros = new int [10];

     for (io = 0; io < n�meros.length; io++) {
     System.out.print("Dame el n�mero " + (io+1) + ":  " );
     n�meros[io] = Teclado.nextInt();

		for(int e=1;e<n�meros.length;e++){
     	if(n�meros [io]== n�meros [o-e]){
     	do{
		System.out.println(" ");
		System.out.println("[Numero repetido]");
		System.out.println(" ");
			while(n�meros [io]== n�meros [o-e]){
			System.out.print("Dame otro n�mero: ");
			n�meros[io] = Teclado.nextInt();
			}
			i++;} while (i<10);
			}
	}
}
}
}



