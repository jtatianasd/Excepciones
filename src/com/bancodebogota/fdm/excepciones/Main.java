/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.excepciones;

import java.util.*;
import java.io.*;

/**
 *
 * @author jtati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String st1 = "aba";
        ManejoString objString = new ManejoString();
        objString.EsPalindromoStringBuilder(st1);
        objString.EsPalindromoStringBuffer(st1);
        st1 = "Hola";
        objString.EsPalindromoStringBuilder(st1);
        objString.EsPalindromoStringBuffer(st1);
        Main objMain = new Main();
        objMain.elRecurso();
        try {
            objMain.divisionChecked();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        objMain.divisionUnchecked();

    }

    public void elRecurso() {
        try (Recurso objRecurso = new Recurso()) {

        } catch (Exception error) {
            System.out.println(error.toString());
        }
    }

    public int divisionChecked() throws DivisionPorCero {

        int numerador = 0;
        int divisor = 0;
        int valor = 0;
        if (divisor == 0) {
            throw new DivisionPorCero("No se puede dividr por cero");

        } else {
            valor = numerador / divisor;
        }

        return valor;

    }

    public void divisionUnchecked() {
        int valor = 0;
        try {
            valor = 3 / 0;
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}

// write your code here

