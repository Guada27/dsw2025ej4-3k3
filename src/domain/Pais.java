/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Maxi
 */
public class Pais {
     private final String nombre;
    private final String codigoIso;

    public Pais(String nombre, String codigoIso) {
        this.nombre = nombre;
        this.codigoIso = codigoIso;

    }

    public String getNombre() {
        return nombre;
    }


    public String getCodigoIso() {
        return codigoIso;
    }
}
