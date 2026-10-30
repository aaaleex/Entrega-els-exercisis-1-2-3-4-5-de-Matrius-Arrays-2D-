import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        int[][] resultado = new int[3][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            int suma = 0;
            int max = matriz[0][j];
            int min = matriz[0][j];
            for (int i = 0; i < n; i++) {
                suma += matriz[i][j];
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
            resultado[0][j] = suma;
            resultado[1][j] = max;
            resultado[2][j] = min;
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 3xm (Fila 0: Suma, Fila 1: Máximo, Fila 2: Mínimo):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}