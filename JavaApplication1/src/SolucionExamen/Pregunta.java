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
public class Pregunta {
    private String titulo;
    private Opcion opciones[];

    public String getTitulo() {
        return titulo;
    }

    public Pregunta(String titulo, Opcion[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }
}
