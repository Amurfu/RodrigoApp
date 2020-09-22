/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigoapp;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menu {

    Scanner lector = new Scanner(System.in);

    public Menu() {

    }

    public void iniciar() {
        boolean menu = true;
        while (menu) {
            mostrarMenu();
            try {
                int accion = lector.nextInt();
                acciones(accion);
            } catch (Exception e) {
                System.out.println("Error al leer la seleccion");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("1:- Crear Matriz de 0 y numeros aleatorios");
        System.out.println("2:- Crear Matriz y mostrar metodos getPlus y getMinus");
        System.out.println("3:- Crear Matriz y comparar con otra");
        System.out.println("4:- Crear y mostrar matriz identidad");
        System.out.println("0:- Salir");
    }

    private void acciones(int accion) {
        switch (accion) {
            case 1:
                crearMatriz();
                break;
            case 2:
                crearMatrizPlusMinu();
                break;
            case 3:
                compararMatriz();
                break;
            case 4:
                mostrarIdentidad();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    private void crearMatriz() {
        try {
            System.out.println("Ingrega el tamaño que tendra la matriz");
            int tamaño = lector.nextInt();
            Matriz matriz = new Matriz(tamaño);
            System.out.println("Mostrando matriz ");
            matriz.show();
            matriz.llenarDeNumerosAleatorios();
            System.out.println("Mostrando matriz con numero aleatorios");
            matriz.show();
        } catch (Exception e) {
            System.out.println("Algo salio mal " + e.getMessage());
        }
    }

    private void crearMatrizPlusMinu() {
        try {
            System.out.println("Ingresa el tamaño de la primera matriz");
            int tamaño = lector.nextInt();
            Matriz matris = new Matriz(tamaño);
            System.out.println("Matriz con numeros aleatorios generados ");
            matris.llenarDeNumerosAleatorios();
            matris.show();
            System.out.println("Ingregsa el tamaño de la matriz 2");
            tamaño = lector.nextInt();
            Matriz matriz_2 = new Matriz(tamaño);
            matriz_2.llenarDeNumerosAleatorios();
            System.out.println("Matriz 2 con numeros aleatorios");
            matriz_2.show();
            System.out.println("Mostrando suma de matriz (getPlus)");
            Matriz matris_Suma = new Matriz(tamaño);
            matris_Suma.setMatriz(matris.getPlus(matriz_2.getMatriz()));
            matris_Suma.show();
            System.out.println("Mostrando resta de matriz (getMinus)");
            Matriz matriz_resta = new Matriz(tamaño);
            matriz_resta.setMatriz(matris.getMinus(matriz_2.getMatriz()));
            matriz_resta.show();
        } catch (Exception e) {
            System.out.println("Algo salio mal "+e.getMessage());
        }
    }

    private void compararMatriz() {
        try {
            System.out.println("Ingresa el tamaño de la matriz 1");
            int tamaño_1 = lector.nextInt();
            System.out.println("Ingresa el tamaño de la matriz 2 ");
            int tamaño_2 = lector.nextInt();
            Matriz matriz_1 = new Matriz(tamaño_1);
            Matriz matriz_2 = new Matriz(tamaño_2);
            System.out.println("Mostrando matriz 1");
            matriz_1.show();
            System.out.println("Mostrando matriz 2 ");
            matriz_2.show();
            boolean sonIguales = matriz_1.matrizIgual(matriz_2.getMatriz());
            System.out.println("¿Son iguales?: "+sonIguales);
        } catch (Exception e) {
            System.out.println("Algo salio mal "+e.getMessage());
        }
    }

    private void mostrarIdentidad() {
        try {
            System.out.println("Ingregse el tamaño de la matriz ");
            int tamaño = lector.nextInt();
            Matriz matriz = new Matriz(tamaño);
            System.out.println("Mostrando matriz normal");
            matriz.show();
            System.out.println("Mostrando identidad");
            Matriz identidad = matriz.getidentidad();
            identidad.show();
        } catch (Exception e) {
            System.out.println("Algo salio mal "+e.getMessage());
        }
    }
}
