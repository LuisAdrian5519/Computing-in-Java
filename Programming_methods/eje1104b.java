import java.util.Scanner;
public class eje1104b
{
     public static void main (String [] args)
     {
     Scanner Teclado = new Scanner (System.in);

	int i=1;
	int o=10;
	int io=0;
    int [] números = new int [10];

     for (io = 0; io < números.length; io++) {
     System.out.print("Dame el número " + (io+1) + ":  " );
     números[io] = Teclado.nextInt();

		for(int e=1;e<números.length;e++){
     	if(números [io]== números [o-e]){
     	do{
		System.out.println(" ");
		System.out.println("[Numero repetido]");
		System.out.println(" ");
			while(números [io]== números [o-e]){
			System.out.print("Dame otro número: ");
			números[io] = Teclado.nextInt();
			}
			i++;} while (i<10);
			}
	}
}
}
}



