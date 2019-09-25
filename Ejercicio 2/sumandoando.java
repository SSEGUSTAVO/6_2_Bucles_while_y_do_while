import java.util.Scanner;
public class sumandoando{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double res = 0;
	System.out.println("Se realizará una suma de numeros, ingrese 0 para calcular el resultado.");
	System.out.print("Ingrese un número: ");
	double num = input.nextDouble();
	do{
	    System.out.println("Ingrese otro número: ");
	    num = input.nextDouble();
	    res = res + num;
	}  while (num != 0);
	System.out.println("La suma de los números ingresados es: " + res);
    }
}