import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[20][6];
        double mejorNotaCurso = Double.MIN_VALUE;
        double peorNotaCurso = Double.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            double suma = 0;
            double max = -1;
            double min = 11;
            for (int j = 0; j < 3; j++) {
                System.out.print("  Ingrese nota parcial " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
                suma += matriz[i][j];
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
            double promedio = suma / 3.0;
            matriz[i][3] = promedio;
            matriz[i][4] = max;
            matriz[i][5] = min;

            if (max > mejorNotaCurso) {
                mejorNotaCurso = max;
            }
            if (min < peorNotaCurso) {
                peorNotaCurso = min;
            }
        }

        System.out.println("\nMatriz resultante (Nota 1, Nota 2, Nota 3, Promedio, Nota Alta, Nota Baja):");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMejor nota del curso: " + mejorNotaCurso);
        System.out.println("Peor nota del curso: " + peorNotaCurso);

        scanner.close();
    }
}