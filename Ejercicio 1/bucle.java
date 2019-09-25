import java.util.Scanner;
public class bucle{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double res = 0;
	System.out.println("Ingrese un número positivo para calcular su raíz cuadrada: ");
	double num = input.nextDouble();
	while (num <= 0){
	    System.out.println("Error, ingrese un número mayor a cero para calcular su raíz cuadrada: ");
	    num = input.nextDouble();
	}
	res = Math.sqrt(num);
	System.out.println("La raíz de "+ num + " es: "+ res);
    }
}