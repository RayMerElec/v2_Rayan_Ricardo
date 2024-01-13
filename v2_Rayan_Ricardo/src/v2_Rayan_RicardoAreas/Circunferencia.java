package v2_Rayan_RicardoAreas;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio de la circunferencia
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular el área y el perímetro
        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        // Mostrar los resultados
        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Perímetro de la circunferencia: " + perimetro);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para calcular el área de la circunferencia
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función para calcular el perímetro de la circunferencia
    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}

