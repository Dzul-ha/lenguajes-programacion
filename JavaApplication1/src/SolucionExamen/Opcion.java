/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author T-101
 */
public class Opcion {
    private String titulo;
    private boolean estatus;

    public String getTitulo() {
        return titulo;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public Opcion(String titulo, boolean estatus) {
        this.titulo = titulo;
        this.estatus = estatus;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
  
}
