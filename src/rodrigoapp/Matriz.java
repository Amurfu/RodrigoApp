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
public class Matriz {

    private int[][] matrizInvocada;

    //si se llama este constructor se crea la matrizInvocada de 0 
    //con una dimencion aleatoria
    public Matriz(int dimencion) {
        crearMatrizCero(dimencion);
    }

    public int[][] getMatriz() {
        return matrizInvocada;
    }
    
    public void setMatriz(int[][] nuevaMatriz){
        this.matrizInvocada = nuevaMatriz;
    }

    //Metodo que llena la matrizInvocada de numeros aleatorios
    public void llenarDeNumerosAleatorios() {
        for (int[] matriz1 : matrizInvocada) {
            for (int y = 0; y < matriz1.length; y++) {
                matriz1[y] = numeroAleatorio();
            }
        }
    }

    public int[][] getPlus(int[][] matriz1) {
        //se llama al metodo que me dice si son del mismo tamaño o no
        if (matrizIgual(matriz1)) {
            //si si son del mismo tamaño se retorna la nuevca matrizInvocada
            int[][] matrizSuma = dameMatrizSuma(matriz1);
            return matrizSuma;
        } else {
            //si no son, retorna null y muestra un mensaje 
            System.out.println("Error, Tamaño de matriz diferente a la invocada.");
            return null;
        }
    }

    public int[][] getMinus(int[][] matriz1) {
        //se llama al metodo que me dice si son del mismo tamaño o no
        if (matrizIgual(matriz1)) {
            //si si son del mismo tamaño se retorna la nuevca matrizInvocada
            int[][] matrizSuma = dameMatrizresta(matriz1);
            return matrizSuma;
        } else {
            //si no son, retorna null y muestra un mensaje 
            System.out.println("Error, Tamaño de matriz diferente a la invocada.");
            return null;
        }
    }

    //Metodo que muestra la matrizInvocada en consola
    public void show() {
        for (int[] matriz1 : matrizInvocada) {
            for (int y = 0; y < matriz1.length; y++) {
                System.out.print(" | ");
                System.out.print(matriz1[y]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
    
    public Matriz getidentidad(){
        Matriz matrizIdentidad = new Matriz(matrizInvocada.length);
        for (int i = 0; i < matrizInvocada.length; i++) {
            matrizIdentidad.getMatriz()[i][i]  = 1;
        }
        return matrizIdentidad;
    }

    //metodo que compara los tamaños de la matrizInvocada 
    public boolean matrizIgual(int[][] matrizAComparar) {
        return (matrizAComparar.length == matrizInvocada.length) && (matrizAComparar[0].length == matrizInvocada[0].length);
    }

    private void crearMatrizCero(int dimencion) {
        matrizInvocada = new int[dimencion][dimencion];
        //se llena de 0 la matrizInvocada
        llenarMatrizCero(dimencion);
    }

    //regresa un numero aleatorio
    private int numeroAleatorio() {
        return (int) Math.floor(Math.random() * 9 + 1);
    }

    private void llenarMatrizCero(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matrizInvocada[i][j] = 0;
            }
        }
    }

    private int[][] dameMatrizSuma(int[][] matriz1) {
        //se crea la matrizInvocada del mismo tamaño que la invocada 
        int[][] suma = new int[matrizInvocada.length][matrizInvocada[0].length];
        //arreglo que recorre cada elemento de la matrizInvocada invocada
        for (int x = 0; x < matrizInvocada.length; x++) {
            for (int y = 0; y < matrizInvocada[x].length; y++) {
                //se suman los valores de la matrizInvocada dada y invocada 
                suma[x][y] = matrizInvocada[x][y] + matriz1[x][y];
            }
        }
        return suma;
    }

    private int[][] dameMatrizresta(int[][] matriz1) {
        int[][] resta = new int[matrizInvocada.length][matrizInvocada[0].length];
        for (int x = 0; x < matrizInvocada.length; x++) {
            for (int y = 0; y < matrizInvocada[x].length; y++) {
                resta[x][y] = matrizInvocada[x][y] - matriz1[x][y];
            }
        }
        return resta;
    }

}
