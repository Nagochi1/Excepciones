/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.excepciones;

/**
 *
 * @author NAGOCHI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //Métodos División por cero
    public double divisionChecked(double dividendo, double divisor) {
        try {
            if (divisor == 0) {
                throw new DivisionPorCeroException("La división no se puede realizar porque el divisor es cero");
            }
        } catch (DivisionPorCeroException ex) {
            System.out.println(ex);
        }

        return dividendo / divisor;
    }

    public int divisionUnchecked(int dividendo, int divisor) {
        int resultado = 0;
        try {
            resultado = dividendo / divisor;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return resultado;
    }

    public double divisionThrow(double dividendo, double divisor) throws DivisionPorCeroException {
        if (divisor == 0) {
            throw new DivisionPorCeroException("Error");
        }

        return dividendo / divisor;
    }

    public void abrirRecurso() {
        try (MiRecurso mr = new MiRecurso()) {

        } catch (Exception ex) {

        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("Ejemplo Checked");
        main.divisionChecked(6, 0);

        System.out.println("\nEjemplo Unchecked");
        main.divisionUnchecked(6, 0);

        System.out.println("\nEjemplo Throws");
        try {
            main.divisionThrow(6, 3);
        } catch (DivisionPorCeroException ex) {
            System.out.println(ex);
        }

        System.out.println("\nEjemplo Autoclosable");
        main.abrirRecurso();

        System.out.println("\nEjecución palindromo con StringBuffer");
        ManejoStrings palindromoSBuffer = new ManejoStrings();
        boolean verificar = palindromoSBuffer.palindromeSBuffer("aabaa");
        if (verificar == true) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

        System.out.println("\nEjecución palindromo con StringBuilder");
        ManejoStrings palindromoSBuilder = new ManejoStrings();
        boolean verificar1 = palindromoSBuilder.palindromeSBuilder("abb");
        if (verificar1 == true) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

        System.out.println("\nEjecución párrafo con StringBuffer");
        ManejoStrings parrafoSBuffer = new ManejoStrings();
        parrafoSBuffer.parrafoSBuffer("Juan");

        System.out.println("\nEjecución párrafo con StringBuilder");
        ManejoStrings parrafoSBuilder = new ManejoStrings();
        parrafoSBuilder.parrafoSBuilder("Carolina");

    }

}
