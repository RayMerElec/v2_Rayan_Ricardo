package v2_Rayan_RicardoAreas;
import java.util.Scanner;
public class AreaTriangulo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la longitud de la base del triángulo: ");
	        double base = scanner.nextDouble();

	        System.out.print("Ingrese la altura del triángulo: ");
	        double altura = scanner.nextDouble();

	        double area = calcularAreaTriangulo(base, altura);

	        System.out.println("El área del triángulo es: " + area);

	    }

	    public static double calcularAreaTriangulo(double base, double altura) {
	        return 0.5 * base * altura;
	    }
}
