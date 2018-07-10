/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.excepciones;

/**
 *
 * @author jtati
 */
public class ManejoString {

    public void EsPalindromoStringBuilder(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String s2 = String.valueOf(stringBuilder.reverse());
        String resultado = "";
        if (s.equals(s2)) {
            resultado = "Es palindromo -- Builder";
        } else {
            resultado = "No es palindromo -- Builder";
        }
        System.out.println(resultado);
    }

    public void EsPalindromoStringBuffer(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        String s2 = String.valueOf(stringBuffer.reverse());
        String resultado = "";
        if (s.equals(s2)) {
            resultado = "Es palindromo -- Buffer";
        } else {
            resultado = "No es palindromo -- Buffer";
        }
        System.out.println(resultado);
    }

}
