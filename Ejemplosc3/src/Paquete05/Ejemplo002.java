/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {
    public static void main(String[] args) {
        
        int suma = 0;
        
        int[][] arreglo = {{10, 41, 40 ,}, {1, 2, 3}, {1, 12, 4}};
                        //  0   1   2       0  1  2    0   1  2
        for (int fila = 0; fila < 1; fila++){
            for (int col = 0; col < 1; col++){
                suma = suma + arreglo[0][0] + arreglo[1][1] + arreglo[2][2];
                System.out.printf("El total de la suma es: %d\n",suma);
            }
        }
    }
}
