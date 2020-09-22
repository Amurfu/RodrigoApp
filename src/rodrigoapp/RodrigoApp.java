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
     Menu menu = new Menu();
     menu.iniciar();
           
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
