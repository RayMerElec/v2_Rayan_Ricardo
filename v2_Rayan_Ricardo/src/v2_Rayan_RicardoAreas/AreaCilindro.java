package v2_Rayan_RicardoAreas;
import java.util.Scanner;
public class AreaCilindro {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double area = calcularAreaCilindro(radio, altura);

        System.out.println("El área del cilindro es: " + area);

        scanner.close();
    }

    private static double calcularAreaCilindro(double radio, double altura) {
        double areaBase = Math.PI * Math.pow(radio, 2); // Área de la base
        double areaLateral = 2 * Math.PI * radio * altura; // Área lateral

        double areaTotal = 2 * areaBase + areaLateral;

        return areaTotal;
    }
}
