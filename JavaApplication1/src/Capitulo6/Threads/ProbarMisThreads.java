/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.Threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //Ciclo de vida del thread sin contar pausa
        //1.Creado
        MiPrimerThread t1=new MiPrimerThread();
        //opcionalmente lo bautizamos
        t1.setName(" Dzul-ha");
        //2.Inicializado
        t1.start();
        //3.En ejecución (cuando corras este programa!!! y se active su metodo run
        //5.Muerte: cuando complete la tarea que tiene el código del método run
    }
    
}
