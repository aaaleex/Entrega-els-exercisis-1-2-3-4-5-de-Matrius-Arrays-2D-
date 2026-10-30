import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        int[] sumaColumnas = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                sumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }

        scanner.close();
    }
}