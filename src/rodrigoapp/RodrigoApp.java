/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigoapp;



/**
 *
 * @author Usuario
 */
public class RodrigoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Matriz matriz_1 = new Matriz(5);
       matriz_1.llenarDeNumerosAleatorios();
       System.out.println("Matriz 1");
       matriz_1.show();
       Matriz matriz_2 = new Matriz(5);
       matriz_2.llenarDeNumerosAleatorios();
        System.out.println("Matriz 2");
       matriz_2.show();
       int [][] matris_3 = matriz_1.getPlus(matriz_2.getMatriz());    
       if(matris_3!=null){
           System.out.println("Matriz sumada ");
           mostrarEstaMatriz(matris_3);       
       }
       int [][] matrizResta = matriz_1.getMinus(matriz_2.getMatriz());
       if(matrizResta!=null){
           System.out.println("Matriz resta");
           mostrarEstaMatriz(matrizResta);
       }
       Matriz matriz_4 = new Matriz(2);
       Matriz identidad = matriz_4.getidentidad();
        System.out.println("Identidad");
        identidad.show();
           
    }

    private static void mostrarEstaMatriz(int[][] matriz) {
          for (int[] matriz1 : matriz) {
            for (int y = 0; y < matriz1.length; y++) {
                System.out.print(" | ");
                System.out.print(matriz1[y]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

}
