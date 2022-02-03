package co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der -- YA
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc -- YA
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar --ok
    // TODO: 2/02/2022 método para imprimir la matriz --ok
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza

    public static void main(String[] args) {
        int[][] matriz = fun_crar();
        fun_llenar_fila_izq_der(matriz, 1, 0);
        fun_llenar_col_arriba_abajo(matriz, 4, 3);
        fun_llenar_fila_der_izq(matriz, 7, 3);
        fun_llenar_col_abajo_arriba(matriz, 10, 0);
        fun_llenar_fila_izq_der(matriz,12,1);
        fun_llenar_col_arriba_abajo(matriz, 14, 2);
        fun_llenar_fila_der_izq(matriz,15,2);
        fun_imprimir(matriz);


    }

    public static int[][] fun_crar() {
        System.out.println("Ingrese la cantidad de filas: ");
        Scanner scan = new Scanner(System.in);
        int filas = scan.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        int columnas = scan.nextInt();
        int matriz[][] = new int[filas][columnas];

        return matriz;
    }

    public static void fun_imprimir(int matriz[][]) {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("|");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]);
                if (columna != matriz[fila].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }

    public static void fun_llenar_fila_izq_der(int matriz[][], int num_inicial, int num_fila) {
        for (int fila = 0; fila <= num_fila; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (matriz[num_fila][columna] == 0) {
                    matriz[num_fila][columna] = num_inicial;
                }
                num_inicial++;
            }
        }
    }

    public static void fun_llenar_col_arriba_abajo(int matriz[][], int num_inicial, int num_col) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col <= num_col; col++) {
                if (matriz[fila][num_col] == 0) {
                    matriz[fila][num_col] = num_inicial;
                }
            }
            num_inicial++;
        }

    }

    public static void fun_llenar_fila_der_izq(int matriz[][], int num_inicial, int num_fila) {
        for (int fila = 0; fila <= num_fila; fila++) {
            for (int col = matriz[num_fila].length - 1; col >= 0; col--) {
                if (matriz[num_fila][col] == 0) {
                    matriz[num_fila][col] = num_inicial;
                }
                num_inicial++;
            }
        }

    }

    public static void fun_llenar_col_abajo_arriba(int matriz[][], int num_inicial, int num_col) {
        for (int filas = matriz.length - 1; filas >= 0; filas--) {
            for (int col = 0; col < matriz.length; col++) {
                if (matriz[filas][num_col] == 0) {
                    matriz[filas][num_col] = num_inicial;
                }
            }
            num_inicial++;
        }
    }

}


