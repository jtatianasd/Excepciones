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
public class Recurso implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Cerrando todo");
    }

}
