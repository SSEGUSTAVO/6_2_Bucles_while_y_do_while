import java.util.Scanner;
public class bucle{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double res = 0;
	System.out.println("Ingrese un n�mero positivo para calcular su ra�z cuadrada: ");
	double num = input.nextDouble();
	while (num <= 0){
	    System.out.println("Error, ingrese un n�mero mayor a cero para calcular su ra�z cuadrada: ");
	    num = input.nextDouble();
	}
	res = Math.sqrt(num);
	System.out.println("La ra�z de "+ num + " es: "+ res);
    }
}